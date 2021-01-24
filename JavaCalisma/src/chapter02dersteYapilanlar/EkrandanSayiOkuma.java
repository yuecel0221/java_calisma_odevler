package chapter02dersteYapilanlar;

import java.util.Scanner;

public class EkrandanSayiOkuma {
    public static void main(String[] args) {
        // genelde en ustte tanimlanir
        Scanner klavye = new Scanner(System.in);
        

        System.out.println("Bir sayi giriniz: ");

        int sayi = klavye.nextInt();
        System.out.println("Girdiginiz sayi: " + sayi);
    }
}
