import java.util.Random;
import java.util.Scanner;

public class NumberGuess2 {

	public static void main( String[] args ) {

		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Try to guess a random number between 1-10.");
		int num = 1 + r.nextInt(10);
		System.out.print("Your guess: ");
		int guess = keyboard.nextInt();
		while ( guess != num ) {
			System.out.println("That is incorrect. Guess again.");
			System.out.print("Your guess: ");
			guess = keyboard.nextInt();
		}
		System.out.println("That's right! You're a good guesser.");
	}
}
