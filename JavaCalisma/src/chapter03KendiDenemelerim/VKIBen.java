package chapter03KendiDenemelerim;

import java.util.Scanner;

public class VKIBen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter weight with pound: ");
        double weight = scanner.nextDouble();

        System.out.println("Please enter weight with inch: ");
        double height = scanner.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        final double METERS_PER_INCH = 0.0254; // Constant

dogru degil

        double bmi = weight / (height * height); //burda parantez kullan cunku ortalik karisabilir

        System.out.println("bmi: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

    }
}
