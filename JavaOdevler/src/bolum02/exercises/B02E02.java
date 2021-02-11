package bolum02.exercises;

import java.util.Scanner;

public class B02E02 {
    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yaricap giriniz: ");
        double yaricap = scanner.nextDouble();
        System.out.println("Yukseklik giriniz: ");
        double yukseklik = scanner.nextDouble();

        double alan = yaricap * yaricap * PI;
        double hacim = alan * yukseklik;

        System.out.println("Alan: " + alan);
        System.out.println("Hacim: " + hacim);





    }
}
