package bolum03.alistirmalar;

import java.util.Scanner;

public class B03A04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int y = scanner.nextInt();
        int x = 5;
        if (y > 0) {
            x = 1;
        }

        System.out.println(x);
    }
}
