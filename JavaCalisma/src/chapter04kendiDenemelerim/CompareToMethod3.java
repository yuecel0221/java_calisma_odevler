package chapter04kendiDenemelerim;

import java.util.Scanner;

public class CompareToMethod3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a city: ");
        String city1 = scanner.nextLine();

        System.out.println("Enter a city again: ");
        String city2 = scanner.nextLine();

        int compare = city1.compareTo(city2);
        System.out.println(compare);

        if (city1.compareTo(city2) < 0)
            System.out.println("The cities in alphabetical order are " +
                    city1 + " " + city2);
        else
            System.out.println("The cities in alphabetical order are " +
                    city2 + " " + city1);
    }
}
