import java.util.Scanner;

public class RightCheck {

	public static void main( String[] args ) {

		System.out.println("Enter three integers:");
		Scanner input = new Scanner(System.in);
		System.out.print("Side 1: ");
		int side1 = input.nextInt();
		System.out.print("Side 2: ");
		int side2 = input.nextInt();
		while ( side1 > side2 ) {
			System.out.println( side2 + " is smaller than " + side1 + ". Try Again.");
			System.out.print("Side 2: ");
			side2 = input.nextInt();
		}
		System.out.print("Side 3: ");
		int side3 = input.nextInt();
		while ( side2 > side3 ) {
			System.out.println( side3 + " is smaller than " + side2 + ". Try Again.");
			System.out.print("Side 3: ");
			side3 = input.nextInt();
		}
		if ( side1*side1 + side2*side2 == side3*side3 ) {
			System.out.println("Your sides do make a right angled triangle.");
		} else {
			System.out.println("They don't make a right angled triangle.");
		}
	}
}
