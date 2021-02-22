package bolum03.exercises;

import java.util.Scanner;

public class B03E03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a");
        double a = scanner.nextDouble();

        System.out.println("Enter b");
        double b = scanner.nextDouble();

        System.out.println("Enter c");
        double c = scanner.nextDouble();

        System.out.println("Enter d");
        double d = scanner.nextDouble();

        System.out.println("Enter e");
        double e = scanner.nextDouble();

        System.out.println("Enter f");
        double f = scanner.nextDouble();

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);

        if (a * d - b * c == 0) {
            System.out.println("The equation has no solution");
        } else {
            System.out.println("x = " + x + " y = " + y);
        }


    }
}
