package bolum03.exercises;

import java.util.Scanner;

public class B03E14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int headsOrTails = (int) (System.currentTimeMillis() % 2);

        System.out.println("Guess what? Heads or tails? 0: Heads 1: Tails");
        int guess = scanner.nextInt();

        System.out.println("Result is: " + headsOrTails);

        if (headsOrTails == guess) {
            System.out.println("True!");
        } else {
            System.out.println("Sorry not true");
        }


    }
}
