package bolum02.exercises;

import java.util.Scanner;

public class B02E15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("x1 koordinatini giriniz: ");
        double x1 = scanner.nextDouble();


        System.out.println("y1 koordinatini giriniz: ");
        double y1 = scanner.nextDouble();

        System.out.println("x2 koordinatini giriniz: ");
        double x2 = scanner.nextDouble();

        System.out.println("y2 koordinatini giriniz: ");
        double y2 = scanner.nextDouble();

        double islem = ((x2 - x1) * (x2 - x1))  + ((y2 - y1) * (y2 - y1));
        double mesafe = Math.pow(islem,0.5);

        System.out.println(mesafe);

    }
}
