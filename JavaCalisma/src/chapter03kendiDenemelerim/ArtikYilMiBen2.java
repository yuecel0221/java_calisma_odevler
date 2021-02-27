package chapter03kendiDenemelerim;

import java.util.Scanner;

public class ArtikYilMiBen2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir yil giriniz: ");
        int artikYil = scanner.nextInt();

         boolean artikYilMi = (artikYil % 4 == 0 && artikYil % 100 != 0) || (artikYil % 400 == 0);

         if (artikYilMi) {
             System.out.println("Artik yildir");
         } else {
             System.out.println("Artik yil degildir");
         }
    }
}
