import java.util.Scanner;

public class AddLoop {

	public static void main( String[] arg ) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("I will add up the numbers you give me.");
		System.out.print("Number: ");
		int num = keyboard.nextInt();
		int total = num;
		while ( num != 0 ) {
			System.out.println("The total so far is " + total);
			System.out.print("Number: ");
			num = keyboard.nextInt();
			total += num;
		}
		System.out.println("The total is " + total);
	}
}
