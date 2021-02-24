package bolum03.exercises;

import java.util.Scanner;

public class B03E12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 3 digit number: ");

        int number = scanner.nextInt();

        int firstDigit = number / 100;
        int thirdDigit = number % 10;

        if (firstDigit == thirdDigit) {
            System.out.println(number + " is a palindrom number");
        } else {
            System.out.println(number + " is not a palindrom number");
        }

    }
}
