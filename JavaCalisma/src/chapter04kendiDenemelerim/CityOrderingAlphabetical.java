package chapter04kendiDenemelerim;

import java.util.Scanner;

public class CityOrderingAlphabetical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a city name: ");
        String city1 = scanner.nextLine();

        System.out.print("Enter a city name again: ");
        String city2 = scanner.nextLine();

        if (city1.compareTo(city2) < 0) {
            System.out.println("Alphabetically order is: " + city1 + " -  " + city2);
        } else {
            System.out.println("Alphabetically order is: " + city2 + " - " + city1);
        }

    }
}
