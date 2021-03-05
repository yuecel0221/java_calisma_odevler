package chapter04kendiDenemelerim;

import java.util.Scanner;

public class ReadingACharacterFromConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character");

        String s = scanner.nextLine();

        char c = s.charAt(0);

        System.out.println("First character is " + c);
    }
}
