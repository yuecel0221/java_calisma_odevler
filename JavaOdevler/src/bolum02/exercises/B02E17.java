package bolum02.exercises;

import java.util.Scanner;

public class B02E17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("58 ve 41 arasinda Fahrenheit degeri giriniz:");
        double fahrenheit = scanner.nextDouble();

        System.out.println("2 ve uzeri ruzgar hizini mil cinsinden giriniz: ");
        double ruzgarHizi = scanner.nextDouble();

        double hissedilen = 35.74 + (0.6215 * fahrenheit) - (35.75 * Math.pow(ruzgarHizi,0.16)) + 0.4275 * fahrenheit * Math.pow(ruzgarHizi,0.16);

        System.out.println(hissedilen);
    }
}
