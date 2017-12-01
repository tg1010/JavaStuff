public class FizzBuzz {

	public static void main( String[] args) {

		String word = "";
		for ( int i = 1 ; i <= 100; i++) {

			if ( i % 3 == 0 ) {

				word += "Fizz";
			}

			if ( i % 5 == 0 ) {

				word += "Buzz";
			}

			if ( word.equals("")) {

				System.out.println(i);
			} else {
				System.out.println(word);
			}
			word = "";
		}
	}
}
