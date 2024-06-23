import java.util.Random;
import java.util.Scanner;
class NumberGuessingGame {
    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();
        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Variable to keep track of the number of attempts
        int numberOfAttempts = 0;
        boolean hasGuessedCorrectly = false;

        // Welcome message
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Can you guess what it is?");

        // Game loop
        while (!hasGuessedCorrectly) {
            // Prompt the user to enter their guess
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfAttempts++;

            // Check if the user's guess is correct, too high, or too low
            if (userGuess == randomNumber) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("It took you " + numberOfAttempts + " attempts.");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}


