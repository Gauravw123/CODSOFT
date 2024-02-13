import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        String playAgain = "";

        do {
            int attempts = 0;
            int numberToGuess = random.nextInt(100) + 1;
            int guess = 0;

            System.out.println("Guess a number between 1 and 100:");

            while (guess != numberToGuess && attempts < 10) {
                guess = scanner.nextInt();
                attempts++;

                if (guess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else if (guess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                }
            }

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number.");
                score += 1;
            } else {
                System.out.println("Sorry, you didn't guess the number. The number was " + numberToGuess);
            }

            System.out.println("Your score is: " + score);
            System.out.println("Do you want to play again? (yes/no)");
            playAgain = scanner.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        scanner.close();
    }
}
