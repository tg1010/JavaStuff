public class Compare {

	public static void main( String[] args ) {

		System.out.print("compare \"red\" with \"blue\" ");
		int i = "red".compareTo("blue");
		System.out.println(i);
                System.out.println("should be -4");
                System.out.println("Apple".compareTo("Egg"));
		System.out.println("should be 0");
		System.out.println("cow".compareTo("cow"));
		System.out.println("should be 3");
		System.out.println("pig".compareTo("monkey"));
	}
}
