package chapter02dersteYapilanlar;

import java.util.Scanner;

public class BozuklukSayisiBulmaBen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Para miktarini giriniz: ");

        double amount = scanner.nextDouble();

        int totalAmount = (int) (amount * 100);

        int birlik = totalAmount / 100;

        totalAmount %= 100;

        int elliKurus = totalAmount / 50;

        totalAmount %= 50;

        int yirmiBesKurus = totalAmount / 25;

        totalAmount %= 25;

        int onKurus = totalAmount / 10;

        totalAmount %= 10;

        int besKurus = totalAmount / 5;

        totalAmount %= 5;

        int birKurus = totalAmount;

        System.out.println("1 tl sayisi: " + birlik);
        System.out.println("50 kurus sayisi: " + elliKurus);
        System.out.println("25 kurus sayisi: " + yirmiBesKurus);
        System.out.println("10 kurus sayisi: " + onKurus);
        System.out.println("5 kurus sayisi: " + besKurus);
        System.out.println("1 kurus sayisi: " + birKurus);
    }
}
