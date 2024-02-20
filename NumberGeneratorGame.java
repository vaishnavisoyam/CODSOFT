import java.util.Scanner;
import java.util.Random;

public class NumberGeneratorGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int maxAttempts = 5;

        System.out.println("Hello ia m NEON lets play Random Number Generator Game!");
        System.out.println("I have generated a random number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + ": Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + attempt + " attempts.");
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }

            if (attempt == maxAttempts) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + randomNumber + ".");
            }
        }

        scanner.close();
    }
}

