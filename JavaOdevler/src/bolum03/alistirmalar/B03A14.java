package bolum03.alistirmalar;

import java.util.Scanner;

public class B03A14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        }

        if (number % 5 == 0) {
            System.out.println(number + " is multiple of 5");
        }

    }
}
