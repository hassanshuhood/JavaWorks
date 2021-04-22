package work.src.thread.RestThreadRun;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import javax.ws.rs.core.MultivaluedMap;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import com.sun.jersey.api.client.ClientResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Program {
    private static String URL = "http://slc14ydv.us.oracle.com:7601/notification/tenant1/.Compute-FAHED/api/v1/emailAccounts/faehyp212.fa.dc1.c9dev2.oraclecorp.com/folders/INBOX/messages/";

    public static void main(String[] args) {
        RESTInvokerHelper restInvokerHelper = new RESTInvokerHelper();
        String responseBody = null;
        boolean fetchReadEmails = false;
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        // params.add("isRead", String.valueOf(fetchReadEmails));

        final ClientResponse response = restInvokerHelper.getHttpResponseGET(URL, params, null);
        if (null != response) {
            responseBody = response.getEntity(String.class);
        }
        System.out.println(responseBody);

        parseAndStoreDataInDB(responseBody);

    }

    private static void parseAndStoreDataInDB(String response) {
        if (null != response) {
            JSONParser parser = new JSONParser();
            JSONObject jsonOb;
            try {
                jsonOb = (JSONObject) parser.parse(response);
                if (null != jsonOb) {
                    JSONArray emailArray = (JSONArray) jsonOb.get("items");
                    Iterator<JSONObject> iter = emailArray.iterator();
                    int rowCounter = 0;
                    List<FetchMultiProcessor> callableList = null;
                    ExecutorService executorService = null;
                    // CNSRestRequestUtility cnsRestRequestUtility = new
                    // CNSRestRequestUtility(emailReceiptContext);

                    while (iter.hasNext()) {
                        try {
                            if (callableList == null) {
                                callableList = new ArrayList<FetchMultiProcessor>();
                                executorService = Executors.newFixedThreadPool(10);

                            }
                            String fromEmailAddress = null;
                            JSONObject email = iter.next();
                            int messageId = Integer.parseInt(email.get("id").toString());
                            String subject = email.get("subject") != null ? (String) email.get("subject") : ""; // 2.
                            String timeStampString = email.get("sentOn").toString(); // 3.
                            JSONArray senderEmailDetailsArray = (JSONArray) email.get("from");
                            if (senderEmailDetailsArray != null) {
                                Iterator<JSONObject> iterator = senderEmailDetailsArray.iterator();
                                while (iterator.hasNext()) {
                                    JSONObject senderDetails = iterator.next();
                                    if (null != senderDetails) {
                                        fromEmailAddress = senderDetails.get("emailAddress") != null
                                                ? (String) senderDetails.get("emailAddress")
                                                : ""; // 4.
                                    }
                                }
                            }
                            DataParams dataParam = new DataParams(messageId);
                            dataParam.setEmailSubject(subject);
                            dataParam.setEmailSentDate(timeStampString);
                            dataParam.setDownloadRequestId(1234L);
                            dataParam.setStatusCode("NEW_MAIL");
                            dataParam.setSenderEmailAddress(fromEmailAddress);

                            callableList.add(new FetchMultiProcessor(dataParam));

                            List <Future <DataParams>> futureResultList = submitExecutors(executorService, callableList);
                            processFutureResponseList(futureResultList);
                        } catch (Exception e) {

                        }
                    }

                }
            } catch (Exception e) {

            }
        }
    }

    private static void processFutureResponseList(List<Future<DataParams>> futureResultList) throws InterruptedException, ExecutionException {
        for(Future<DataParams> futureResultItem: futureResultList) {
            DataParams processedResult = futureResultItem.get();
            if(processedResult != null){
                System.out.println(processedResult);
            }
        }
    }

    private static List<Future<DataParams>> submitExecutors(ExecutorService executorService,
            List<FetchMultiProcessor> callableList) {
                List <Future <DataParams>> futureResultList  = null;
            try {
                futureResultList = executorService.invokeAll(callableList);
                executorService.shutdown();
                executorService.awaitTermination(3600, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        return futureResultList;
    }
}
