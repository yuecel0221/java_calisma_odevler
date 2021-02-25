package bolum03.exercises;

import java.util.Scanner;

public class B03E15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int piyango = (int) (Math.random() * 900) + 100;

        System.out.println(piyango);
        System.out.println("Piayngo icin iki basamakli bir sayi tahmin ediniz: ");
        int tahmin = scanner.nextInt();

        int piyangoBirlerBasamagi = piyango % 10;
        int piyangoOnlarBasamagi = (piyango / 10) % 10;
        int piyangoYuzlerBasamagi = piyango / 100;

        int tahminBirlerBasamagi = tahmin % 10;
        int tahminOnlarBasamagi = (tahmin / 10) % 10;
        int tahminYuzlerBasamagi = tahmin / 100;

        System.out.println("Piyango numarasi: " + piyango);

        if (piyango == tahmin) {
            System.out.println("Tebrikler piyangoyu bildiniz. 10000 TL kazandiniz.");
        } else if ((piyangoBirlerBasamagi == tahminBirlerBasamagi
                || piyangoBirlerBasamagi == tahminOnlarBasamagi
                || piyangoBirlerBasamagi == tahminYuzlerBasamagi) &&
                (piyangoOnlarBasamagi == tahminBirlerBasamagi
                        || piyangoOnlarBasamagi == tahminOnlarBasamagi
                        || piyangoOnlarBasamagi == tahminYuzlerBasamagi) &&
                (piyangoYuzlerBasamagi == tahminBirlerBasamagi
                        || piyangoYuzlerBasamagi == tahminOnlarBasamagi
                        || piyangoYuzlerBasamagi == tahminYuzlerBasamagi)) {
            System.out.println("Rakamlar ayni ama siralamayi tutturamadiniz. 3000 TL kazandiniz.");
        } else if (piyangoBirlerBasamagi == tahminBirlerBasamagi
                || piyangoBirlerBasamagi == tahminOnlarBasamagi
                || piyangoBirlerBasamagi == tahminYuzlerBasamagi
                || piyangoOnlarBasamagi == tahminBirlerBasamagi
                || piyangoOnlarBasamagi == tahminOnlarBasamagi
                || piyangoOnlarBasamagi == tahminYuzlerBasamagi
                || piyangoYuzlerBasamagi == tahminBirlerBasamagi
                || piyangoYuzlerBasamagi == tahminOnlarBasamagi
                || piyangoYuzlerBasamagi == tahminYuzlerBasamagi) {
            System.out.println("Bir rakam bildiniz 1000 tl odul kazandiniz");

        } else{
            System.out.println("Bilemediniz :(");
        }
    }
}
