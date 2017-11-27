import java.util.Scanner;

public class HowOld2 {

	public static void main( String[] args ) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Hey, what's your name? ");

		String name = keyboard.next();

		System.out.print("OK, " + name + ", how old are you? ");

		int age = keyboard.nextInt();

		if ( age >= 25 ) {

			System.out.print("You can do pretty much anything, " + name + "." );
		}

		else if ( age >= 18 ) {

			System.out.print("You can vote but not rent a car," + name + ".");

		}

		else if ( age >= 16 ) {

			System.out.print("You can drive but not vote, " + name + "." );

		}

		else {

			System.out.print("You can't drive, " + name + "." );

		}

	}
}
