package Strings;

public class StringTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("spring");
        sb = sb.delete(3, 5);//.insert(2, "umme").deleteCharAt(1);
        System.out.println("sb = " + sb);


        sb = new StringBuffer("spring");
        char[] c = "sbcddgggjfkdd".toCharArray();
        sb.toString().toLowerCase();
        sb.toString().toUpperCase();
        


    }
}
