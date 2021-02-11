package bolum02.exercises;

import java.util.Scanner;

public class B02E01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Celcius derece giriniz: ");
        double celcius = scanner.nextDouble();
        double fahrenheit = (9.0 / 5) * celcius + 32;
        System.out.println(celcius + " derece " + fahrenheit + " fahrenheittir");
    }
}
