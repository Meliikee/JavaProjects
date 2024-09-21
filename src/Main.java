public class Main {
    public static void main(String[] args) {

        try {
            int[] sayilar = new int[]{1, 2, 3};
            System.out.println(sayilar[5]);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Genel Hata");
            System.out.println(e);
        } finally {
            System.out.println("Ben her türlü çalışırım.");
        }

    }
}