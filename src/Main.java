public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel. ";

        System.out.println(mesaj);
        System.out.println("5.eleman: " + mesaj.charAt(4));
        System.out.println("Eleman sayısı: " + mesaj.length());
        System.out.println(mesaj.concat("Yaşasın!"));

        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));

        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf('a')); // İlk bulduğunu verir ve aramayı bitirir.

        System.out.println(mesaj.lastIndexOf('a')); // Aramaya sondan başlar ama yine index numarasını verir.

        System.out.println(mesaj.replace(" ", "-"));
        System.out.println(mesaj.substring(6));
        System.out.println(mesaj.substring(6, 10));

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        System.out.println(mesaj.trim()); // Baştaki ve sondaki boşlukları atar.
    }
}