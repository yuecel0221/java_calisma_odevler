package bolum03.exercises;

import java.util.Scanner;

public class B03E10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);

        System.out.print("What is " + number1 + " + " + number2 + " = ?");

        int answer = scanner.nextInt();

        if (number1 + number2 == answer) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Not true");
        }
    }
}
