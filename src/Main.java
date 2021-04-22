package work.src;

public class Main {


    public static void main(String[] args) { 
        String s = "1234";
        Long l = 1234L;
        Long s2 = (Long)getAttr();
        if( l.equals((Long)getAttr())){
            System.out.println("true");;
        }
        else{
            System.out.println(false);
        }
    }

    public static Object getAttr(){
        return (Object)"1234";
    }
    
}
