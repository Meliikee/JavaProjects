public class Main {
    public static void main(String[] args) {
        int number = 2;
        int i = 2;

        while (true) {
            if (i < number || number < 2) {
                if (number % i == 0 || number < 2) {
                    System.out.println("Bu sayı asal değildir.");
                    break;
                }
                i++;
            } else {
                System.out.println("Bu sayı asaldır.");
                break;
            }
        }

        System.out.println("*********** OR *****************");
        boolean isPrime = true;

        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                isPrime = false;
            }
        }

        if (isPrime == true && !(number < 2)) {
            System.out.println("Bu sayı asaldır.");
        } else {
            System.out.println("Bu sayı asal değildir.");
        }
    }
}