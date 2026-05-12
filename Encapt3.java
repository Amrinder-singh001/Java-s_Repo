class ATM {

    private int pin = 1234;
    private int balance = 50000;

    void checkPin(int enteredPin) {

        if (enteredPin == pin) {
            System.out.println("Balance = " + balance);
        } else {
            System.out.println("Wrong PIN");
        }
    }
}

class Encapt3 {
    public static void main(String[] args) {

        ATM a = new ATM();

        a.checkPin(1234);
    }
}