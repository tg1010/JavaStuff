import java.util.Scanner;

public class FiveYears {

	public static void main( String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Hello. What is your name? ");
		String name = keyboard.next();
		System.out.print("\n Hi, " + name + "!  How old are you? ");
		int age = keyboard.nextInt();
		System.out.println("Did you know that in five years you will be " + (age+5) + " years old?");
		System.out.println("And five years ago you were " + (age-5) + "! Imagine that!");
	}
}
