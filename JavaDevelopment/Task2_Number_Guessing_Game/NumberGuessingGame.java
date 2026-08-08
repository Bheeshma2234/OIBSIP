import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("=================================");
        System.out.println("       NUMBER GUESSING GAME");
        System.out.println("=================================");
        System.out.println();
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (guess != number) {

            System.out.print("\nEnter your guess: ");
            guess = scanner.nextInt();

            attempts++;

            if (guess < number) {
                System.out.println("Too low! Try a higher number.");
            } 
            else if (guess > number) {
                System.out.println("Too high! Try a lower number.");
            } 
            else {
                System.out.println();
                System.out.println("Congratulations!");
                System.out.println("You guessed the correct number.");
                System.out.println("Number of attempts: " + attempts);
            }
        }

        scanner.close();
    }
}
