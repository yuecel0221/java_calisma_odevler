package chapter02dersteYapilanlar;

import java.util.Scanner;

public class VergiMiktari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("please enter pruchase amount");
        double purchaseAmount = scanner.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("purchase amount: " + (int) (tax * 100) / 100.0);
    }
}
