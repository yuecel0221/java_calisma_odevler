package bolum03.exercises;

import java.util.Scanner;

public class B03E13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("0 for single filers\n1 for married filing jointly or qualified widow(er)\n" +
                "2 for married filing separately\n3 for head of household\nPlease choose one of these: ");
        int status = scanner.nextInt();

        System.out.println("Enter the taxable income: ");
        double income = scanner.nextDouble();

        double tax = 0;

        if (status == 0) {
            if (income <= 8350) {
                tax = income * 0.10;
            } else if (income <= 33950) {
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            } else if (income <= 82250) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
            } else if (income <= 171550) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25
                        + (income - 82250) * 0.28;
            } else if (income <= 372950) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25
                        + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
            } else {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25
                        + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
            }
        }

        System.out.println("Tax is: " + (int) (tax * 100) / 100.0);

    }
}
