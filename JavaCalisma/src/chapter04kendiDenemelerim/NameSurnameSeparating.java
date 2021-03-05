package chapter04kendiDenemelerim;

import java.util.Scanner;

public class NameSurnameSeparating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name and surname using just one space:");

        String input = scanner.nextLine();

        int i = input.indexOf(' ');

        String firsfName = input.substring(0,i);
        String lastName = input.substring(i+1);

        System.out.println("Firs Name: " + firsfName);
        System.out.println("Last Name: " + lastName);

    }
}
