package bolum02.exercises;

import java.util.Scanner;

public class B02E19 {
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


        System.out.println("x3 koordinatini giriniz: ");
        double x3 = scanner.nextDouble();

        System.out.println("y3 koordinatini giriniz: ");
        double y3 = scanner.nextDouble();

        double side1islem = ((x2 - x1) * (x2 - x1))  + ((y2 - y1) * (y2 - y1));
        double side1 = Math.pow(side1islem,0.5);

        double side2islem = ((x2 - x3) * (x2 - x3))  + ((y2 - y3) * (y2 - y3));
        double side2 = Math.pow(side2islem,0.5);

        double side3islem = ((x1 - x3) * (x1 - x3))  + ((y1 - y3) * (y1 - y3));
        double side3 = Math.pow(side3islem,0.5);

        double s = (side1 + side2 + side3) / 2.0;

        double sKokIslem = s * (s - side1) * (s-side2) * (s-side3);

        double area = Math.pow(sKokIslem,0.5);
        System.out.println(area);
    }
}
