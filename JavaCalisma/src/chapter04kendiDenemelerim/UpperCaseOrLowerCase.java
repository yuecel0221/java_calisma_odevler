package chapter04kendiDenemelerim;

import java.util.Scanner;

public class UpperCaseOrLowerCase {
    public static void main(String[] args) {
        char ece = '\u2764';
        //char ece1 = '\u2130';
        System.out.println(ece);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");

        char ch = scanner.next().charAt(0);

        if ('A' <= ch && ch <= 'Z') {
            System.out.println(ch + " is an uppercase letter");
        } else if ('a' <= ch && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter");
        } else if ('0' <= ch && ch <= '9') {
            System.out.println(ch + " is a number");
        }
    }
}
