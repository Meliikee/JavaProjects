public class AccountManager {
    private double balance;

    public void deposit(double amount) {
        balance = getBalance() + amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance = getBalance() - amount;
        } else {
            System.out.println("Bakiye yetersiz.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
