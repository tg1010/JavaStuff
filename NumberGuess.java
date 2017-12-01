import java.util.Random;
import java.util.Scanner;
public class NumberGuess {

	public static void main ( String[] args ) {

		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int number = 1 + r.nextInt(10);
		System.out.println("I'm thinking of number guess it");
		System.out.print("Your guess: ");
		int guess = keyboard.nextInt();
		if ( number == guess) {

			System.out.println("That's right! My secret number was " + number);
		} else {

			System.out.println("Your wrong. It was " + number);
		}
	}
}

