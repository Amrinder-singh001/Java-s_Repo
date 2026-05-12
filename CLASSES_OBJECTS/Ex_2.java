package CLASSES_OBJECTS;
class Bank {

    void interestRate() {
        System.out.println("Bank Interest Rate");
    }
}

class SBI extends Bank {

    void interestRate() {
        System.out.println("SBI Interest Rate is 7%");
    }
}

class HDFC extends Bank {

    void interestRate() {
        System.out.println("HDFC Interest Rate is 10%");
    }
}

class ICICI extends Bank {

    void interestRate() {
        System.out.println("ICICI Interest Rate is 20%");
    }
}

class BankDemo {
    public static void main(String[] args) {

        Bank b;

        b = new SBI();
        b.interestRate();

        b = new HDFC();
        b.interestRate();

        b = new ICICI();
        b.interestRate();
    }
}