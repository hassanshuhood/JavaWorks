package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileTest {

    public static void main(String[] args) {
        try {
            FileOutputStream f = new FileOutputStream("text.log");
            ObjectOutputStream o = new ObjectOutputStream(f);
            SampleObject samp = new SampleObject();
            o.writeObject(samp);
            o.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
