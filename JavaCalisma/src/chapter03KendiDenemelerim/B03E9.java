package chapter03KendiDenemelerim;

import java.util.Scanner;

public class B03E9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 6 digit number leading zeros: ");
        int number1 = scanner.nextInt();

        int d1 = number1 / 100000;
        int remainingDigits = number1 % 100000;

        int d2 = remainingDigits / 10000;
        remainingDigits %= 10000;

        int d3 = remainingDigits / 1000;
        remainingDigits %= 1000;

        int d4 = remainingDigits /100;
        remainingDigits %= 100;

        int d5 = remainingDigits / 10;
        remainingDigits %= 10;

        int d6 = remainingDigits;

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);
        System.out.println("d4 = " + d4);
        System.out.println("d5 = " + d5);
        System.out.println("d6 = " + d6);

    }
}
