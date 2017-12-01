import java.util.Scanner;

public class Collatz {

	public static void main( String[] args ) {

		Scanner input = new Scanner(System.in);
		System.out.print("Starting number: ");
		int n = input.nextInt();
		int count = 0;
		int largest = n;
		while ( n != 1 ) {
			System.out.print(n + "	");
			if ( n % 2 == 0 ) {
				n /= 2;
			} else {
				n = 3*n + 1;
				if ( n > largest) {
					largest = n;
				}
			}
			count++;
		}
		System.out.println(n);
		System.out.println("Terminated after " + count + " steps.");
		System.out.println("Largest value was " + largest + ".");
	}
}
