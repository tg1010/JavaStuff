import java.util.Scanner;

public class TwoQuestions {

	public static void main( String[] args ) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("TWO QUESTIONS!\nThink of an object, and I'll try to guess it.");
		System.out.println("Question 1) Is it animal, vegetable, or mineral?");
		String ans1 = keyboard.next();
		System.out.println("Question 2) Is it bigger than a breadbox?");
		String ans2 = keyboard.next();

		if ( ans1.equals("animal") ) {

			if ( ans2.equals("yes") ) {

				System.out.println("My guess is Moose");
			} else {

				System.out.println("My guess is Mouse");
			}
		}
		else if ( ans1.equals("vegetable") ) {

			if ( ans2.equals("yes") ) {

				System.out.println("My guess is Watermelon");

			} else {

				System.out.println("My guess is carrot");
			}
		}
		else if ( ans1.equals("mineral") ) {

			if ( ans2.equals("yes") ) {

				System.out.println("My guess is a Camaro");
			} else {

				System.out.println("My guess is a paper clip");
			}
		}
	}
}
