public class Main {
    public static void main(String[] args) {
        // For döngüsü:
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti.");

        // While döngüsü:
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println(i);
        }
        System.out.println("While Döngüsü Bitti.");

        // Do-While döngüsü:
        int j = 1;
        do {
            System.out.println("Şart sağlanmasa bile bir defa çalışır.");
        } while (j > 10);
        System.out.println("Do-While Döngüsü Bitti.");
    }
}