abstract class Payment {

    abstract void pay();
}

class PhonePe extends Payment {

    void pay() {
        System.out.println("Payment using PhonePe");
    }
}

class GooglePay extends Payment {

    void pay() {
        System.out.println("Payment using GooglePay");
    }
}

class Abstract2 {

    public static void main(String[] args) {

        PhonePe p1 = new PhonePe();
        GooglePay p2 = new GooglePay();

        p1.pay();
        p2.pay();
    }
}