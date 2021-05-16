package java8.interfaces.functional;

import java.io.IOException;
import java.io.PrintWriter;

@FunctionalInterface
public interface MyFunctionalInterface {
    public boolean checkTrue(boolean b);


    public static void print(String text, PrintWriter writer) throws IOException {
        writer.write(text);
    }

    public default void print(String text , boolean b) {
        if (checkTrue(b)){
            System.out.println(text);
        }
        else
            System.out.println("Error");
            
    }

}
