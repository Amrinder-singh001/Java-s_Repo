class Account {

    private int balance;

    void setBalance(int balance) {

        if(balance > 0) {
            this.balance = balance;
        }
        else {
            System.out.println("Invalid Balance");
        }
    }

    int getBalance() {
        return balance;
    }
}
    public class Encapt4validation {
    public static void main(String[] args) {

        Account a = new Account();

        a.setBalance(5000);

        System.out.println(a.getBalance());
    }
}