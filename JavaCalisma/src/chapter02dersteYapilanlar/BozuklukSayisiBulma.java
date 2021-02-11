package chapter02dersteYapilanlar;

import java.util.Scanner;

public class BozuklukSayisiBulma {
    public static void main(String[] args) {
        // ****** Mod alarak cozulur, ameleus cozme
        Scanner scanner = new Scanner(System.in);

        System.out.println("Para Miktarini Giriniz: ");
        double paraMiktari = scanner.nextDouble();
        int toplamKurusMiktari = (int)(paraMiktari * 100);
        int birTlSayisi = toplamKurusMiktari / 100;
        int kalanKurus = toplamKurusMiktari % 100; //toplamKurusMiktari -= birTlSayisi * 100;
        int elliKurusSayisi = kalanKurus / 50;
        kalanKurus %= 50; //toplamKurusMiktari -= elliKurusSayisi * 50;
        int yirmiBesKurusSayisi = kalanKurus / 25;
        kalanKurus %= 25; //toplamKurusMiktari -= yirmiBesKurusSayisi * 25;
        int onKurusSayisi = kalanKurus / 10;
        kalanKurus %= 10; //toplamKurusMiktari -= onKurusSayisi * 10;
        int besKurusSayisi = kalanKurus / 5;
        kalanKurus %= 5; //toplamKurusMiktari-= besKurusSayisi *5;
        int birKurusSayisi = kalanKurus;

        System.out.println("1 TL sayisi: " + birTlSayisi);
        System.out.println("50 kurus sayisi: " + elliKurusSayisi);
        System.out.println("25 kurus sayisi: " + yirmiBesKurusSayisi);
        System.out.println("10 kurus sayisi: " + onKurusSayisi);
        System.out.println("5 kurus sayisi: " + besKurusSayisi);
        System.out.println("1 kurus sayisi: " + birKurusSayisi);

    }
}
