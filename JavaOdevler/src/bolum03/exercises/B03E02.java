package bolum03.exercises;

import java.util.Scanner;

public class B03E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int number3 = (int) (Math.random() * 10);

        int sum = number1 + number2 + number3;

        System.out.println(number1 + " + " + number2 + " + " + number3 + " = ?");
        System.out.println("Enter the sum of these three integer:");
        int guessSum = scanner.nextInt();

        if (sum == guessSum) {
            System.out.println("Correct answer!");
        } else {
            System.out.println("Wrong answer!");
        }


    }
}
