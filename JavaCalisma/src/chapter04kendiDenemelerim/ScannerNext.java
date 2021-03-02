package chapter04kendiDenemelerim;

import java.util.Scanner;

public class ScannerNext {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ekrana bir kac kelime giriniz: ");

        String hello = scanner.next();

        System.out.println(hello);

    }
}
