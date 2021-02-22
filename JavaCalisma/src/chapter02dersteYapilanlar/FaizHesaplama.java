package chapter02dersteYapilanlar;

import java.util.Scanner;

public class FaizHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yillik faiz oranini giriniz (Orn. 4.5): ");
        double yillikFaizOrani = scanner.nextDouble();

        System.out.println("Kac yilda odemek istiyorsunuz (Orn. 5 ): ");
        int yil = scanner.nextInt();

        System.out.println("Borc alinacak miktar: (Orn. 1567.23)");
        double borcMiktari = scanner.nextDouble();

        double aylikFaizOrani = yillikFaizOrani / 1200;

        double aylikOdemeMiktari = (borcMiktari * aylikFaizOrani) / (1-1/Math.pow(1+aylikFaizOrani,yil*12));
        double toplamBorc = aylikOdemeMiktari * 12* yil;

        System.out.println("Aylik Odeme Miktari: " + (int)(aylikOdemeMiktari * 100)/ 100.0
        );
        System.out.println("Toplam Odenecek Miktar: " + toplamBorc);






    }
}
