package chapter04kendiDenemelerim;

import java.util.Scanner;

public class ComputeAngels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three points for angels x1 y2 x2 y2 x3 y3 respectively: ");

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double a = Math.sqrt(((x2 - x3) * (x2 - x3)) + ((y2 - y3) * (y2 - y3)));
        double b = Math.sqrt(((x1 - x3) * (x1 - x3)) + ((y1 - y3) * (y1 - y3)));
        double c = Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y3)));

        double angleA = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double angleB = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double angleC = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

        System.out.println("The three angles are :  " + Math.round(angleA * 100) / 100.0 + " " + Math.round(angleB * 100) / 100.0 + " " + Math.round(angleC * 100) / 100.0);


    }
}
