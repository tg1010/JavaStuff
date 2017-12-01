import java.util.Scanner;

public class CountMac {

	public static void main( String[] args ) {

			Scanner keyboard = new Scanner(System.in);
			System.out.print("Count from: ");
			int from = keyboard.nextInt();
			System.out.print("Count to: ");
			int to = keyboard.nextInt();
			System.out.print("Count by: ");
			int step = keyboard.nextInt();

			for (int n = from; n <= to; n+=step){

				System.out.print( n + " ");
			}
	}
}
