import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; // 1 to 100
        int attempts = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Try to guess it.");

        while (true) {
            System.out.print("Enter your guess: ");
            if (!scanner.hasNextInt()) {
                String badInput = scanner.next();
                System.out.println("Please enter a valid whole number.");
                continue;
            }

            int guess = scanner.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("Please guess a number between 1 and 100.");
                continue;
            }

            if (guess < secretNumber) {
                System.out.println("Too low. Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Correct! Well done.");
                System.out.println("You guessed the number in " + attempts + " attempts.");
                break;
            }
        }

        scanner.close();
    }
}
