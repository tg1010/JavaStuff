import java.util.Scanner;

public class SafeRoot {

	public static void main( String[] args ) {

		Scanner input = new Scanner(System.in);
		System.out.println("Square root!");
		int num = -1;
		while ( num < 0) {
			System.out.print("Enter number: ");
	                num = input.nextInt();
		}
		System.out.println("The square root of " + num + " is " + Math.sqrt(num) + ".");
	}
}
