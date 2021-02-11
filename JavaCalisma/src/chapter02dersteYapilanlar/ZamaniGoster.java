package chapter02dersteYapilanlar;

import java.util.Scanner;

public class ZamaniGoster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int saniye = scanner.nextInt();

        int dakika = saniye / 60;

        int kalanSaniye = saniye % 60;

        System.out.println(saniye + " saniye " + dakika + " dakika " + kalanSaniye + " saniyedir ");
    }
}
