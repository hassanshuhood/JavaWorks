package java8.interfaces.functional;

public class MyFunctionalInterfaceImpl {
    public static void main(String[] args) {
        MyFunctionalInterface FI ;
        FI = new MyFunctionalInterface(){

            @Override
            public boolean checkTrue(boolean b) {
                return !b;
            }

        };

        FI = (boolean b) -> !b;

        FI = MyFunctionalInterfaceImpl::checkTrue;

        FI.print("Hi", Boolean.TRUE);
    }

    public static boolean checkTrue(boolean b) {
        return !b;
    }
}
