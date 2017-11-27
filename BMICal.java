import java.util.Scanner;

public class BMICal {

		public static void main( String[] args ) {

			Scanner keyboard = new Scanner(System.in);
			System.out.print("Your height (feet only): ");
			double feet = keyboard.nextDouble();
			System.out.print("Your height (inches): ");
			double inch = keyboard.nextDouble();
			System.out.print("Your weight in pounds: ");
			double pounds = keyboard.nextDouble();
			double height = ((feet * 12 ) + inch) * 0.0254;
			double weight = pounds * 0.4536;
			double bmi = weight / (height * height);
			System.out.println("\n Your BMI is " + bmi);
	}
}
