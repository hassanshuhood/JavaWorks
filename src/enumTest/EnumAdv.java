package enumTest;

public class EnumAdv {

    public static void main(String[] args) {
        System.out.println("start");

        for (Names n : Names.values()) {
            System.out.println(n);
            if (n == Names.PHIL)
                System.out.println("this is phil");

            n.getInstrument();

            System.out.print(", instrument: " + n.getInstrument());
            System.out.println(", sings: " + n.sings());
        }

        Names a = Names.PHIL;
        a.getInstrument();

    }

}