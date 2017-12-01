import java.util.Scanner;
public class AlpOrd {

	public static void main( String[] arg ) {

		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is your Surname? ");
		String name = keyboard.next();
		if ("Young".compareTo(name) < 0 ) {

			System.out.println("not going anywhere for a while?");

		} else if ("Smith".compareTo(name) < 0 ) {

			System.out.println("it's gonna be a while");
		} else if ("Jones".compareTo(name) < 0 ) {

			System.out.println("looks like a bit of a wait");
		} else if ("Carswell".compareTo(name) < 0 ) {

			System.out.println("that's not bad");
		} else {

			System.out.println("you don't have long to wait");
		}
	}
}
