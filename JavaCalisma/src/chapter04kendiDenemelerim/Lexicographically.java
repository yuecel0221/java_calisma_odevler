package chapter04kendiDenemelerim;

import java.util.Scanner;

public class Lexicographically {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String str1 = scanner.next();

        System.out.println("Enter a word again: ");
        String str2 = scanner.next();

        int number = 0;

        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            if ((int) str1.charAt(i) == (int) str2.charAt(i)) {
                continue;
            } else {
                number = (int) str1.charAt(i) - (int) str2.charAt(i);
            }
        }

        if (str1.length() < str2.length()) {
            number = (str1.length() - str2.length());
        } else {
            number = (str1.length() - str2.length());
        }

        if (number < 0) {
            System.out.println("order: " + str1 + " " + str2);
        } else {
            System.out.println("order: " + str2 + " " + str1);
        }

    }
}

