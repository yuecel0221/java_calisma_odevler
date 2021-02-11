package bolum02.exercises;

import java.util.Scanner;

public class B02E16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kenar uzunlugu giriniz:");
        double kenar = scanner.nextDouble();
        double kokUc = Math.pow(3,0.5);
        double alan = (kenar * kenar) * ((3 * kokUc) / 2.0);
        System.out.println(alan);


    }
}
