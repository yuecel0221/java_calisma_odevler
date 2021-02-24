package bolum03.exercises;

import java.util.Scanner;

public class B03E11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an number for a month between 1-12 and a year");

        int month = scanner.nextInt();
        int year = scanner.nextInt();

        switch (month) {
            case 1 : System.out.println("January and 31 days"); break;
            case 2 : if (year % 4 == 0) {System.out.println("January and 29 days");}
            else {System.out.println("January and 28 days"); }; break;
            case 3 : System.out.println("March and 31 days"); break;
            case 4 : System.out.println("April and 30 days"); break;
            case 5 : System.out.println("May and 31 days"); break;
            case 6 : System.out.println("June and 30 days"); break;
            case 7 : System.out.println("July and 31 days"); break;
            case 8 : System.out.println("August and 31 days"); break;
            case 9 : System.out.println("September and 30 days"); break;
            case 10 : System.out.println("October and 31 days"); break;
            case 11 : System.out.println("November and 30 days"); break;
            case 12 : System.out.println("December and 31 days"); break;
            default: System.out.println("Invalid number!"); break;
        }
    }
}
