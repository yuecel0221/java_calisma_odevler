package bolum03.alistirmalar;

import java.util.Scanner;

public class B03A10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = scanner.nextInt();

        if (score >= 60.0) {
            System.out.println("D");
        } else if (score >= 70.0) {
            System.out.println("C");
        } else if (score >= 80.0) {
            System.out.println("B");
        } else if (score >= 90.0) {
            System.out.println("A");
        } else {
            System.out.println("F");
        }

        // mesela score 90 olursa A olmaz D olur, ya en buyukten baslayip azalmaliydi
        // ya da en kucukten baslayip artmaliydi
    }
}
