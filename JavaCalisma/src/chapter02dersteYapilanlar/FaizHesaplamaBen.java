package chapter02dersteYapilanlar;

import java.util.Scanner;

public class FaizHesaplamaBen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("yillik faiz oranini giriniz: (orn. 4.5)");
        double faizOrani = scanner.nextDouble();

        System.out.println("borc miktarini giriniz: ");
        double borcMiktari = scanner.nextDouble();

        System.out.println("kac yilda odemek istiyorsunuz: (orn. 5)");
        int yilSayisi = scanner.nextInt();

        double aylikFaiz = faizOrani / 1200;

        double aylikOdemeMiktari = ((borcMiktari) * aylikFaiz) / (1 - (1 / Math.pow(1 + aylikFaiz, yilSayisi * 12)));
        double toplamBorc = aylikOdemeMiktari * 12 * yilSayisi;

        System.out.println("aylik odeme miktari: " + (int)(aylikOdemeMiktari * 100) / 100.0);
        System.out.println("toplam borc: " + (int)(toplamBorc * 100) / 100.0);
    }
}
