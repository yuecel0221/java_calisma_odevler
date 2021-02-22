package chapter03KendiDenemelerim;

import java.util.Scanner;

public class DersNotuGosterme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ders notunuzu giriniz: ");
        int dersNotu = scanner.nextInt();

        if(dersNotu>=90) {
            System.out.println("Notunuz A");
        } else if (dersNotu >= 80 ) {
            System.out.println("Notunuz B");
        }else if (dersNotu >= 70 ) {
            System.out.println("Notunuz C");
        } else if (dersNotu >= 60 ) {
            System.out.println("Notunuz D");
        } else {
            System.out.println("Kaldiniz");
        }


    }
}
