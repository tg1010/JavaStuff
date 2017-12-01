import java.util.Scanner;

public class AddFor {

	public static void main( String[] args ) {

		Scanner input = new Scanner(System.in);
		System.out.print("Number: ");
		int num = input.nextInt();
		int total = 0;
		for ( int i = 1; i <= num; ++i) {

			total += i;
		}

		System.out.println("Total: " + total);
	}
}
