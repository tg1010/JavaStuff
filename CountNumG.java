import java.util.Random;
import java.util.Scanner;

public class CountNumG {

	public static void main( String[] args ) {

		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Try to guess a random number between 1-10.");
		int num = 1 + r.nextInt(10);
		System.out.print("Your guess: ");
		int guess = keyboard.nextInt();
		int tries = 1;
		while ( guess != num ) {
			System.out.println("That is incorrect. Guess again.");
			System.out.print("Your guess: ");
			guess = keyboard.nextInt();
			tries++;
		}
		System.out.println("That's right! You're a good guesser.");
		System.out.println("It only took you " + tries + " tries.");
	}
}
