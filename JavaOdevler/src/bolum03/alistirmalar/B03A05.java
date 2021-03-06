package bolum03.alistirmalar;

import java.util.Scanner;

public class B03A05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pay = 20;

        System.out.print("Enter a score value: ");

        int score = scanner.nextInt();

        if (score > 90) {
            pay += (pay * 3 / 100);
        }

        System.out.println("Pay: " + pay);
    }
}
