package chapter03KendiDenemelerim;

import java.util.Scanner;

public class CikartmaArasinavBen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayi1 = (int)(Math.random() * 10);
        int sayi2 = (int)(Math.random() * 10);

        if (sayi2 > sayi1) {
            int temp = sayi1;
            sayi1 = sayi2;
            sayi2 = temp;
        }

        int sonuc = sayi1 - sayi2;

        System.out.println(sayi1 + " - " + sayi2 + " = ?");

        int tahmin = scanner.nextInt();

        if (sayi1 - sayi2 == tahmin) {
            System.out.println("Tebrikler bildiniz");
        } else {
            System.out.println("Bilemediniz. Dogru cevap: " + sonuc);
        }



    }
}
