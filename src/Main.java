public class Main {
    public static void main(String[] args) {
        System.out.println(topla());
        System.out.println(topla(1));
        System.out.println(topla(8, 2, 17));
        System.out.println(topla(1, 2, -5));
    }

    public static int topla(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }
}