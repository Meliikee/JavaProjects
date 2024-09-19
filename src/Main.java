public class Main {
    public static void main(String[] args) {
        double[] myList = {1.2, 8.4, 5.8, 7.9, 6.4};
        double total = 0;
        double max = myList[0];

        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total += number;
            System.out.println(number);
        }

        System.out.println("Toplam: " + total);
        System.out.println("En büyük sayı: " + max);
    }
}