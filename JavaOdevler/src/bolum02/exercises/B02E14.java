package bolum02.exercises;

import java.util.Scanner;

public class B02E14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kilonuzu pound cinsinden giriniz:");
        double kiloPound = scanner.nextDouble();

        System.out.println("Boyunuzu inch cinsinden giriniz: ");
        double boyInch = scanner.nextDouble();

        double kiloKg = kiloPound * 0.45359237;
        double boyMetre = boyInch * 0.0254;

        double vki = kiloKg / (boyMetre * boyMetre);

        System.out.println(vki);
    }
}
