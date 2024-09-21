public class Main {
    public static void main(String[] args) {

        try {
            int[] sayilar = new int[]{1, 2, 3};
            System.out.println(sayilar[5]);
        } catch (Exception e) {
            System.out.println("Hata");
            System.out.println(e);
        } finally {
            System.out.println("Ben her türlü çalışırım.");
        }

    }
}