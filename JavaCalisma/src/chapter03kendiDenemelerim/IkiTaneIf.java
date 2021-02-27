package chapter03kendiDenemelerim;

import java.util.Scanner;

public class IkiTaneIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer pls: ");
        int sayi = scanner.nextInt();

        if (sayi % 5 == 0) {
            System.out.println("HiFive");
        }

        if (sayi % 2 == 0)
            System.out.println("HiTwo"); //suslu parantez kullanmazsam yalnizca tek satir ife bagli calisir
        System.out.println("hello im in second if block");
    }
}
