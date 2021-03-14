package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class DailyAdviceServer {
    String[] adviceList = { "Take smaller bites", "Go for the tight jeans. No they do NOT make you look fat.",
            "One word: inappropriate", "Just for today, be honest. Tell your boss what you *really* think",
            "You might want to rethink that haircut." };

    public void go() {
        try {
            ServerSocket serverSock = new ServerSocket(4242);
            while (true) {
                Socket sock = serverSock.accept();
                InputStreamReader ir = new InputStreamReader(sock.getInputStream());
                BufferedReader br = new BufferedReader(ir);
                while(br.readLine() != null ){
                    String line = br.readLine() ;
                    System.out.println(line);
                }
                ir.close();
                br.close();
                // PrintWriter writer = new PrintWriter(sock.getOutputStream());
                // String advice = getAdvice();
                // writer.println(advice);
                // writer.close();
                // System.out.println(advice);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    } // close go

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }
}
