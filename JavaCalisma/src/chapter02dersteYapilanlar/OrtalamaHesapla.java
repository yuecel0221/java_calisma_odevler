package chapter02dersteYapilanlar;

import java.util.Scanner;

public class OrtalamaHesapla {
    public static void main(String[] args) {
        Scanner ahmet = new Scanner(System.in);
        double a = ahmet.nextDouble();
        double b = ahmet.nextDouble();
        double c = ahmet.nextDouble();



        double ort = (a + b + c) / 3;
        System.out.println("Ortalama: " + ort);
    }
}
