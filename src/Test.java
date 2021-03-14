public class Test {
    
    Test t = new Test();

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.toString());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
