package enumTest;

public enum Names {
    JERRY("lead guitar") {
        public String sings() {
            return "plaintively";
        }
    },
    BOBBY("rhythm guitar") {
        public String sings() {
            return "hoarsely";
        }
    },
    PHIL("bass");

    private String instrument;

    Names(String instrument) {
        this.instrument = instrument;
    }

    public String getInstrument() {
        return this.instrument;
    }

    public String sings() {
        return "occasionally";
    }
}
