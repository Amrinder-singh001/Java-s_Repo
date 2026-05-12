class RBI {

    void rate() {
        System.out.println("Interest Rate");
    }
}

class SBI extends RBI {

    void rate() {
        System.out.println("SBI Rate = 7%");
    }

    public static void main(String[] args) {

        SBI s = new SBI();

        s.rate();
    }
}