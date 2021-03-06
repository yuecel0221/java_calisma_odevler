package bolum03.alistirmalar;

import java.util.Scanner;

public class B03A07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0)
            System.out.println(number + " is even.");
        else
            System.out.println(number + " id odd.");

        if (number % 3 == 0)
            System.out.println(number + " is multiple 3");
        System.out.println(number + " is not multiple 2");

    }
}
