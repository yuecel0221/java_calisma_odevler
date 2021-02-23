package bolum03.exercises;

import java.util.Scanner;

public class B03E05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer for today’s day of the week \n(Sunday is 0, Monday is 1, …, and Saturday is 6)");
        int today = scanner.nextInt();

        System.out.println("Enter the number of days after today");
        int future = scanner.nextInt();

        int lastDay = ((today + future) % 7);

        switch (lastDay) {
            case 0: System.out.println("Sunday"); break;
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;

        }

        

    }
}
