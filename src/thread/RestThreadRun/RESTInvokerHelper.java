package work.src.thread.RestThreadRun;

import javax.ws.rs.core.MultivaluedMap;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class RESTInvokerHelper {

    public ClientResponse getHttpResponseGET(String uri, MultivaluedMap<String, String> params, Object object) {
        Client clientInstance = Client.create();
        WebResource webResource = clientInstance.resource(uri);
        String authKey = "Basic ZnVzaW9uaGVkX2FwcGlkOldlbGNvbWUx";
        ClientResponse clientResponse = null;
        clientResponse = webResource.queryParams(params).header("Authorization", authKey).type("application/json").accept("application/json").get(ClientResponse.class);

        return clientResponse;
    }


}
