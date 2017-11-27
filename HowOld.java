import java.util.Scanner;

public class HowOld {

	public static void main( String[] args ) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Hey, what's your name? ");
		String name = keyboard.next();

		System.out.print( "OK, " + name + ", how old are you? " );
		int age = keyboard.nextInt();
		if ( age < 16 ) {

			System.out.println("You can't drive, " + name + ".");
		}

		if ( age < 18 ) {

			System.out.println("You can't vote, " + name + ".");
		}

		if ( age < 25 ) {

			System.out.println("You can't rent a car, " + name + "." );
		}

		if ( age >= 25 ) {

			System.out.println("You can do anything that's legal, " + name );
		}
	}
}
