package bolum02.exercises;

import java.util.Scanner;

public class B02E20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bakiye giriniz: ");
        double bakiye = scanner.nextDouble();

        System.out.println("Faiz orani giriniz:");
        double faizOrani = scanner.nextDouble();

        double faizGetirisi = bakiye * (faizOrani / 1200.0);
        System.out.println("Faiz getirisi: " + faizGetirisi);

    }
}
