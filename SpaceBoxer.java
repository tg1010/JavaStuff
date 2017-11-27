import java.util.Scanner;

public class SpaceBoxer {

	public static void main( String[] args ) {

		double weight, sweight;
		int planet;
		sweight = 0;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter your current earth weight: ");

		weight = keyboard.nextDouble();

		System.out.println("I have information for the following planets: ");
		System.out.println("   1. Venus   2. Mars    3. Jupiter ");
		System.out.println("   4. Saturn  5. Uranus  6. Neptune ");
		System.out.print("\nWhich planet are you visiting? ");

		planet = keyboard.nextInt();

		if ( planet == 1) {

			sweight = weight * 0.78;
		}

		else if ( planet == 2 ) {

			sweight = weight * 0.39;

		}

		else if ( planet == 3 ) {

			sweight = weight * 2.65;

		}

		else if ( planet == 4 ) {

			sweight = weight * 1.17;

		}

		else if ( planet == 5 ) {

			sweight = weight * 1.05;

		}

		else if ( planet == 6 ) {

			sweight = weight * 1.23;

		}

		System.out.println("Your weight would be " + sweight + " pounds on that planet.");
	}
}
