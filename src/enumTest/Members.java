package enumTest;

public enum Members {
    JERRY, BOBBY, PHIL
}

class Test {

    public static void main(String[] args) {
        Members selectedBandMember;
        selectedBandMember = Members.PHIL;
        System.out.println(selectedBandMember == Members.JERRY);
        System.out.println(selectedBandMember == Members.PHIL);

        Members ifName = Members.PHIL;
        switch (ifName) {
        case JERRY:
            System.out.print("make it sing ");
        case PHIL:
            System.out.print("go deep ");
        case BOBBY:
            System.out.println("Cassidy! ");
        }

    }

}
