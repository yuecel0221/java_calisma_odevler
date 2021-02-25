package chapter02dersteYapilanlar;

import java.util.Scanner;

public class KullaniciGirdisiyleAlanHesapla {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        System.out.println("Alan icin yaricap giriniz: ");
        double yaricap = girdi.nextDouble();

        // alani hesapla
        double alan = yaricap * yaricap * 3.14159;

        // alani yazdir
        System.out.println("yaricapi" + yaricap + "olan cemberin alani: " + alan + "dir");
    }
}