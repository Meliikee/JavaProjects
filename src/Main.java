//import matematik.DortIslem;
//import matematik.Logaritma;

import matematik.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");

        int sayi = scanner.nextInt();

        System.out.println("Girilen sayı: " + sayi);

        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(8, 3));

        Logaritma logaritma = new Logaritma();
        logaritma.logaritmaHesapla();
    }
}