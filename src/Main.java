import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // generate a random number between 1 and 100
        Random random1 = new Random();
        int newRandom = random1.nextInt(100) + 1;
        int guesses = 0;
        boolean guessed = false;

        Scanner scanner = new Scanner(System.in);

        while( !guessed ) {
            System.out.println("Please enter a guess between 1 and 100");

            int guess = Integer.parseInt(scanner.nextLine());

            guesses++;

            if( guess == newRandom ) {
                guessed = true;
            } else if( guess < newRandom ) {
                System.out.println("Guess was low");
            } else if( guess > newRandom ) {
                System.out.println("Guess was high");
            }
        }

        System.out.println("Number guessed in " + guesses + " guesses!");

    }
}
