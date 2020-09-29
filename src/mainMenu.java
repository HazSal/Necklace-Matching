
final class mainMenu {

	 public static void menuMain() {
		System .out.println("/////// -  Necklace Matching -  ///////");
		System.out.println("1. Do the two strings describe the same necklace?");
		System.out.println("2. Check how many times a string repeats itself when it's letter is shifted right."); 
		System.out.println("3. Check how many times a string will describe the same necklace in a list.");
		System.out.println("4. Exit sMorse");
		System.out.print("Enter choice: ");
	}

	public static void clearScreen()  {  //Empty lines to clear screen
		for (int i=0; i<1; i++)
		    System.out.println();
	   }
}
