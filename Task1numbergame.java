import java.util.Scanner;
import java.util.Random;


public class Task1numbergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;
        int totalScore = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        while (playAgain) {
            int randomNumber = random.nextInt(100) + 1;
            int attemptsLeft = 10;
            boolean guessedCorrectly = false;
            System.out.println("\nI have generated a number between 1 and 100. Can you guess it?");

            while (attemptsLeft > 0) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attemptsLeft--;

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number!");
                    totalScore += 10;
                    guessedCorrectly = true;
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

                System.out.println("Attempts left: " + attemptsLeft);
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The number was: " + randomNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("\nThank you for playing! Your total score is: " + totalScore);
        scanner.close();
    }
}




