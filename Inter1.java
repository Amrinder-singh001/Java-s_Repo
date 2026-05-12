interface Payment {

    void pay();
}

class PhonePe implements Payment {

    public void pay() {
        System.out.println("Paid using PhonePe");
    }
}

class Inter1 {

    public static void main(String[] args) {

        PhonePe p = new PhonePe();

        p.pay();
    }
}