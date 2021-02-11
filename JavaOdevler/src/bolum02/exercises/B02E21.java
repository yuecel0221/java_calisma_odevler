package bolum02.exercises;

import java.util.Scanner;

public class B02E21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yatirim miktari: ");
        double yatirimMiktari = scanner.nextDouble();

        System.out.println("Yillik faiz orani: ");
        double yillikFaizOrani = scanner.nextDouble();

        System.out.println("Yil sayisi: ");
        double yilSayisi = scanner.nextDouble();

        double yatiriminGeriDonusDegeri = yatirimMiktari * (1 + (yillikFaizOrani / 1200.0)) * yilSayisi * 12;

        System.out.println(yatiriminGeriDonusDegeri);

    }


}
