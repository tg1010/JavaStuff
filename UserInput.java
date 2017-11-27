import java.util.Scanner;

public class UserInput {

	public static void main( String[] args ) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter the following information \n");

		System.out.print("First name: ");
		String firstName = keyboard.next();
		System.out.print("Last name: ");
		String lastName = keyboard.next();
		System.out.print("Grade (9-12): ");
		int grade = keyboard.nextInt();
		System.out.print("Student ID: ");
		int ID = keyboard.nextInt();
		System.out.print("Login: ");
		String login = keyboard.next();
		System.out.print("GPA (0.0-4.0): ");
		double gpa = keyboard.nextDouble();

		System.out.println("\n Your information:");
		System.out.println("	Login: " + login);
		System.out.println("	ID:    " + ID );
		System.out.println("	Name:  " + lastName + ", " + firstName);
		System.out.println("	GPA:   " + gpa );
		System.out.println("	Grade: " + grade);

	}
}
