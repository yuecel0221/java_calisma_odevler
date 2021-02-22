package bolum03.exercises;

import java.util.Scanner;

public class B03E01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a:");
        double a = scanner.nextDouble();

        System.out.println("Enter b:");
        double b = scanner.nextDouble();

        System.out.println("Enter c:");
        double c = scanner.nextDouble();

        double rootDiscriminant = Math.pow((b * b - (4 * a * c)), 0.5);

        double r1;
        double r2;


        if (rootDiscriminant > 0) {
            r1 = (-b + rootDiscriminant) / (2 * a);
            r2 = (-b - rootDiscriminant) / (2 * a);

            System.out.println("The equation has two roots: " + " r1 = " + r1 + " r2 = " + r2);
        } else if (rootDiscriminant == 0) {
            System.out.println("The equation has one root = " + (-b / (2 * a)));
        } else {
            System.out.println("The equation has no real roots");
        }


    }
}
