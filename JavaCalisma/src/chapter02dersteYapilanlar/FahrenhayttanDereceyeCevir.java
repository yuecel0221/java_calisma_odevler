package chapter02dersteYapilanlar;

import java.util.Scanner;

public class FahrenhayttanDereceyeCevir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dereceye donusturmek icin fahrenheit giriniz: ");
        int fahrenheit = scanner.nextInt();
        double celcius = (5.0 / 9) * (fahrenheit - 32);
        //int celcius = (int)((5.0 / 9) * (fahrenheit - 32));
        System.out.println(fahrenheit + " fahrenheit " + celcius + " celcius derecedir.");
    }
}
