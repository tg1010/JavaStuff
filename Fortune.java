import java.util.Random;

public class Fortune {

	public static void main( String[] args ) {

		Random r = new Random();
		int num = 1 + r.nextInt(3);
		String response = "";
		if ( num == 1) {
			response = "Fortune 1";
		} else if ( num == 2 ) {
			response = "Help me";
		} else if ( num == 3 ) {
			response = "Pay no attention to the messages";
		}

		System.out.println("Fortune Cookie Says: " + response);
		System.out.println("Lottery Numbers");
		System.out.print( 1 + r.nextInt(50) + "-" );
		System.out.print( 1 + r.nextInt(50) + "-" );
		System.out.print( 1 + r.nextInt(50) + "-" );
		System.out.println( 1 + r.nextInt(50));
	}
}
