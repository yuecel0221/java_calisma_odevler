package bolum03.exercises;

import java.util.Scanner;

public class B03E17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerStatus = "";
        String computerStatus = "";

        System.out.println("Enter a number scissor (0), rock (1), paper (2):");
        int playerNumber = scanner.nextInt();

        int computerNumber = (int) (Math.random() * 3);

        switch (playerNumber) {
            case 0:
                playerStatus = "scissor";
                break;
            case 1:
                playerStatus = "rock";
                break;
            case 2:
                playerStatus = "paper";
        }

        System.out.println("You are " + playerStatus);


        switch (computerNumber) {
            case 0:
                computerStatus = "scissor";
                break;
            case 1:
                computerStatus = "rock";
                break;
            case 2:
                computerStatus = "paper";
        }

        System.out.println("Computer is " + computerStatus);

        if (computerNumber == 0 && playerNumber == 0) {
            System.out.println("It is a draw");
        } else if (computerNumber == 0 && playerNumber == 1) {
            System.out.println("You win");
        } else if (computerNumber == 0 && playerNumber == 2) {
            System.out.println("Computer win");
        } else if (computerNumber == 1 && playerNumber == 0) {
            System.out.println("Computer win");
        } else if (computerNumber == 1 && playerNumber == 1) {
            System.out.println("It is a draw");
        } else if (computerNumber == 1 && playerNumber == 2) {
            System.out.println("You win");
        } else if (computerNumber == 2 && playerNumber == 0) {
            System.out.println("You win");
        } else if (computerNumber == 2 && playerNumber == 1) {
            System.out.println("Computer win");
        } else if (computerNumber == 2 && playerNumber == 2) {
            System.out.println("It is a draw");
        }
    }
}
