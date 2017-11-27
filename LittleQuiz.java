import java.util.Scanner;

public class LittleQuiz {

	public static void main( String[] args ) {

		Scanner keyboard = new Scanner(System.in);
		int count = 0;

		System.out.print("Are you ready for a quiz? ");
		keyboard.next();

		System.out.print("Okay, here it comes!" );

		System.out.println("\nQ1) What is capital of Alaska? ");
		System.out.println("            1) Melbourne");
		System.out.println("            2) Anchorage");
		System.out.println("            3) Juneau");

		int ans1 = keyboard.nextInt();

		if ( ans1 == 3 ) {

			System.out.println("That's right!\n");
			count += 1;
		}

		else {

			System.out.println("That's incorrect, The capital is Juneau\n");
		}

		System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
		System.out.println("      1) yes");
		System.out.println("      2) no");

		int ans2 = keyboard.nextInt();

		if ( ans2 == 2 ) {

			System.out.println("That's right!\n");
			count += 1;

		}

		else {

			System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
		}

		System.out.println("\nOverall, you got " + count + " out of 2 correct.");
		System.out.println("Thanks for playing!");


	}
}
