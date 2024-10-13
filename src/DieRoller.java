import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continueRolling = true;

        while (continueRolling) {
            System.out.println("Rolling dice...");
            int rollCount = 0;


            System.out.printf("%-10s%-10s%-10s%-10s%-10s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------------");

            while (true) {
                rollCount++;
                int die1 = random.nextInt(6) + 1;
                int die2 = random.nextInt(6) + 1;
                int die3 = random.nextInt(6) + 1;
                int sum = die1 + die2 + die3;


                System.out.printf("%-10d%-10d%-10d%-10d%-10d%n", rollCount, die1, die2, die3, sum);


                if (die1 == die2 && die2 == die3) {
                    System.out.println("You rolled a triple!");
                    break;
                }
            }


            System.out.print("Do you want to roll again? (yes/no): ");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("yes")) {
                continueRolling = false;
            }
        }

        scanner.close();
        System.out.println("Thanks for playing!");
    }
}