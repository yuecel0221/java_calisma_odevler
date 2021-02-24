package bolum03.exercises;

import java.util.Scanner;

public class B03E06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the weight in pound: ");
        double weightPound = scanner.nextDouble();

        System.out.println("Enter the height in feet: ");
        double heightFeet = scanner.nextDouble();

        System.out.println("Enter the height in inch: ");
        double heightInch = scanner.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        final double METERS_PER_INCH = 0.0254; // Constant
        final double METERS_PER_FEET = 0.3048; // Constant

        double weightInKilograms = weightPound * KILOGRAMS_PER_POUND;
        double heightInMeters = (heightInch * METERS_PER_INCH) + (heightFeet * METERS_PER_FEET);
        double bki = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.println("BKI : " + bki);

        if (bki < 18.5) {
            System.out.println("Underweight");
        } else if (bki < 25) {
            System.out.println("Normal");
        } else if (bki < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
