package bolum02.exercises;

import java.util.Scanner;

public class B02E08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gmt = scanner.nextInt();

        long toplamMiliSaniye = System.currentTimeMillis();

        long toplamSaniye = toplamMiliSaniye / 1000;

        long toplamDakika = toplamSaniye / 60;
        int suankiSaniye = (int) (toplamSaniye % 60); //*********

        long toplamSaat = toplamDakika / 60;
        long suankiDakika = toplamDakika % 60;
        long suankiSaat = toplamSaat % 24;

        System.out.println((suankiSaat+gmt) + " : " + suankiDakika + " : " + suankiSaniye + " GMT");





    }
}
