package bolum03.exercises;

import java.util.Scanner;

public class B03E07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total money as dollars like 15.60");

        double moneyAmount = scanner.nextDouble();
        int moneyAmountAsCoins = (int)(moneyAmount * 100);

        int oneDollarNumber = moneyAmountAsCoins / 100;
        int remainCoins = moneyAmountAsCoins % 100;

        int quarterNumber = remainCoins / 25 ;
        remainCoins %= 25;

        int dimeNumber = remainCoins / 10;
        remainCoins %= 10;

        int nickelNumber = remainCoins / 5;
        remainCoins %= 5;

        int pennyNumber = remainCoins;

        System.out.println("Total money is " + moneyAmount);

        if (oneDollarNumber > 1) {
            System.out.println(oneDollarNumber + " dollars");
        }else if (oneDollarNumber == 1) {
            System.out.println(oneDollarNumber + " dollar");
        } else {

        }

        if (quarterNumber > 1) {
            System.out.println(quarterNumber + " quarters");
        } else if (quarterNumber ==1) {
            System.out.println(quarterNumber + " quarter");
        } else {

        }

        if (dimeNumber > 1) {
            System.out.println(dimeNumber + " dimes");
        } else if (dimeNumber ==1) {
            System.out.println(dimeNumber + " dime");
        } else {

        }

        if (nickelNumber > 1) {
            System.out.println(nickelNumber + "nickels");
        } else if (nickelNumber ==1) {
            System.out.println(nickelNumber + "nickel");
        } else {

        }

        if (pennyNumber > 1) {
            System.out.println(pennyNumber + " pennies");
        } else if (pennyNumber ==1 ) {
            System.out.println(pennyNumber + " penny");
        } else {

        }

    }
}
