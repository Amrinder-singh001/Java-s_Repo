class RBI {

    void rate() {
        System.out.println("RBI Interest");
    }
}

class PNB extends RBI {

    void rate() {
        System.out.println("PNB Interest = 6%");
    }
}

class ICICI extends RBI {

    void rate() {
        System.out.println("ICICI Interest = 8%");
    }
}

class Dynamic {

    public static void main(String[] args) {

        RBI r;

        r = new PNB();
        r.rate();

        r = new ICICI();
        r.rate();
    }
}