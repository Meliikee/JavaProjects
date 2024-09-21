import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList sayilar = new ArrayList();
        sayilar.add(5);
        sayilar.add(55);
        sayilar.add(11);
        sayilar.add("Melike");

        System.out.println(sayilar.size());
        sayilar.remove(3);
        System.out.println(sayilar.size());
        System.out.println(sayilar.get(2));
        System.out.println(sayilar.get(1));
        System.out.println(sayilar.get(0));

        System.out.println("******************");

        for (Object sayi : sayilar) {
            System.out.println(sayi);
        }

        sayilar.set(1, 7);
        System.out.println(sayilar.get(1));

        sayilar.clear();
        System.out.println(sayilar.size());

    }
}