package chapter03kendiDenemelerim;

import java.util.Scanner;

public class PiyangoBen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int piyango = (int)(Math.random() * 90 + 10);
        System.out.println(piyango);

        System.out.println("Piyango icin bir sayi tahmin ediniz: ");
        int tahmin = scanner.nextInt();

        int piyangoBirlerBasamagi = piyango % 10;
        int piyangoOnlarBasamagi = piyango / 10;

        int tahminBirlerBasamagi = tahmin % 10;
        int tahminOnlarBasamagi = tahmin / 10;

        if(piyango == tahmin) {
            System.out.println("Tebrikler kazandiniz 10000 tl sizin!");
        } else if (piyangoOnlarBasamagi == tahminBirlerBasamagi && piyangoBirlerBasamagi == tahminOnlarBasamagi) {
            System.out.println("Rakamlarin yeri degisik ama olsun 3000 tl sizin!");
        } else if(piyangoBirlerBasamagi == tahminOnlarBasamagi
                || piyangoBirlerBasamagi == tahminBirlerBasamagi
                || piyangoOnlarBasamagi == tahminOnlarBasamagi
                || piyangoOnlarBasamagi == tahminBirlerBasamagi) {
            System.out.println("Bir rakam bildiniz 500 tl sizin!");
        } else {
            System.out.println("Bilemediniz :(");
        }
    }
}
