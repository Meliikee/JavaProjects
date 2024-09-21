public class Main {
    public static void main(String[] args) {

        AccountManager manager = new AccountManager();
        System.out.println("Hesap = " + manager.getBalance());

        manager.deposit(1000);
        System.out.println("Hesap = " + manager.getBalance());

        manager.withdraw(100);
        System.out.println("Hesap = " + manager.getBalance());

        manager.withdraw(950);
        System.out.println("Hesap = " + manager.getBalance());

    }
}