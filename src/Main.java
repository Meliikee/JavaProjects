public class Main {
    public static void main(String[] args) {
        // Mükemmel Sayı
        // 6 --> 1,2,3
        // 28 --> 1,2,4,7,14

        int number = 28;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        if (number == total) {
            System.out.println("Bu mükemmel sayıdır !");
        } else {
            System.out.println("Bu mükemmel sayı değildir.");
        }
    }
}