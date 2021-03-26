package Bit;

public class BitManipulation {
    
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        int y = ~x +1;  //(negative no 2's compliment negate +1)
        System.out.println(~x);
        System.out.println(Integer.toBinaryString(~x));
        System.out.println(y);
        System.out.println(Integer.toBinaryString(y));


        andoperator();

        xorOperator();

        shiftOperator();
        
    }

    private static void shiftOperator() {
        System.out.println("shiftOperator");
        int x = 10; // bits are 00001010
        int y = 6;  // bits are 00000110
        System.out.println("x = " + x + " = " +Integer.toBinaryString(x));
        System.out.println("y = " + y + " = " + Integer.toBinaryString(y));

        System.out.println("Right shiftOperator");
        int a = x >> 1;
        System.out.println(a);
        System.out.println(Integer.toBinaryString(a));

        x = -12;
        System.out.println("x = " + x + " = " +Integer.toBinaryString(x));
        System.out.println("second Right shiftOperator");
        a = x >> 1;   //signed 
        System.out.println(a);
        System.out.println(Integer.toBinaryString(a));



        a = x >>> 1;   //signed 
        System.out.println(a);
        System.out.println(Integer.toBinaryString(a));

    }

    private static void xorOperator() {
        System.out.println("xorOperator");
        int x = 10; // bits are 00001010
        int y = 6;  // bits are 00000110
        System.out.println("x = " + Integer.toBinaryString(x));
        System.out.println("y = " +  Integer.toBinaryString(y));

        int a = x ^ y;
        System.out.println(a);
        System.out.println(Integer.toBinaryString(a));
    }

    private static void andoperator() {
        System.out.println("andoperator");
        int x = 10; // bits are 00001010
        int y = 6;  // bits are 00000110
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));

        int a = x & y;
        System.out.println(a);
        System.out.println(Integer.toBinaryString(a));


    }
}
