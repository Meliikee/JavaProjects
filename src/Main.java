public class Main {
    public static void main(String[] args) {

        AccountManager manager = new AccountManager();
        System.out.println("Hesap = " + manager.getBalance());

        manager.deposit(1000);
        System.out.println("Hesap = " + manager.getBalance());

        try {
            manager.withdraw(100);
        } catch (BalanceInsufficentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hesap = " + manager.getBalance());

        try {
            manager.withdraw(950);
        } catch (BalanceInsufficentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hesap = " + manager.getBalance());

    }
}