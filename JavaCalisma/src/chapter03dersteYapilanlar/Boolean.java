package chapter03dersteYapilanlar;

import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("boolean bir deger giriniz: ");
        boolean ece = scanner.nextBoolean();
        System.out.println(ece);
        System.out.println(3 + 2 == 8);
    }
}
