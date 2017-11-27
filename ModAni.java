public class ModAni

{

	public static void main( String[] args ) throws Exception

	{

		for ( int i=0; i<80; i++ )

		{

			if ( i%10 == 0 ) {

				System.out.print("HELLO!!");
			}

			else if ( i%10 == 1 ) {

				System.out.print("!HELLO!");
			}

			else if ( i%10 == 2 ) {

				System.out.print("!!HELLO");

			}

			else if ( i%10 == 3 ) {

				System.out.print("O!!HELL");

			}

			else if ( i%10 == 4 ) {

				System.out.print("LO!!HEL");

			}

			else if ( i%10 == 5 ) {

				System.out.print("LLO!!HE");
			}

			else if ( i%10 == 6 ) {

				System.out.print("ELLO!!H");

			}

			Thread.sleep(200);

		}



	}

}
