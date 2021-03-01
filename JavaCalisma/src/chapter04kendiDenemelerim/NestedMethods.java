package chapter04kendiDenemelerim;

import java.util.Scanner;

public class NestedMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three integer numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int max = (int)Math.max(number1,Math.max(number2, number3));
        System.out.println("The max number is " + max);
    }
}
