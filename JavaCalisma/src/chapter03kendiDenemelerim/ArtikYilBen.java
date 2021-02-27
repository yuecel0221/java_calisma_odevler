package chapter03kendiDenemelerim;

import java.util.Scanner;

public class ArtikYilBen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir yil giriniz: ");

        int yil = scanner.nextInt();
        boolean artikYil = (yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0);
        if(artikYil) {
            System.out.println("Artik yildir");
        } else {
            System.out.println("Artik yil degildir");
        }
    }
}
