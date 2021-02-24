package bolum02.exercises;

import java.util.Scanner;

public class B02E06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("0-1000 araliginda bir sayi giriniz: ");
        int sayi = scanner.nextInt();

        int birlerBas = sayi % 10;
        sayi = sayi / 10;

        int onlarBas = sayi % 10;
        sayi = sayi / 10;

        int yuzlerBas = sayi % 10;

        int rakamlarToplami = (birlerBas + onlarBas + yuzlerBas);

        System.out.println("Sayinin rakamlari toplami: " + rakamlarToplami);
    }
}
