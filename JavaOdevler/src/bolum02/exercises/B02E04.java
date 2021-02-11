package bolum02.exercises;

import java.util.Scanner;

public class B02E04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pound degeri giriniz: ");
        double pound = scanner.nextDouble();
        double kg = pound * (454.0 / 1000);
        System.out.println(pound + " pound " + kg + " kilogramdir");
    }
}
