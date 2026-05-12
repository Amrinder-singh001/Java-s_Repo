class ATM {

    private int balance = 10000;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {

        if(amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw Successful");
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

    void showBalance() {
        System.out.println("Balance = " + balance);
    }
}
    public class Atm{

    public static void main(String[] args) {

        ATM a = new ATM();

        a.deposit(5000);
        a.withdraw(2000);

        a.showBalance();
    }
}