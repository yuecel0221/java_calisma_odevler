package bolum02.exercises;

import java.util.Scanner;

public class B02E05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aratoplami giriniz: ");
        double araToplam = scanner.nextDouble();
        System.out.println("Komisyon oranini giriniz: ");
        double komisyonOrani = scanner.nextDouble();

        double komisyonMiktari = araToplam * komisyonOrani / 100.0;
        double toplam = araToplam + komisyonMiktari;

        System.out.println("Komisyon Miktari: " + komisyonMiktari + " TL");
        System.out.println("Toplam: " + toplam + " TL");



    }
}
