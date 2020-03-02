package projects3;

public class GenerateARandomNumber {

	/*
	 *  Using Math.random(), use it to generate a random
	 *  integer between 1 and 10, inclusive. If the number 
	 *  is under 6, they’re too short to ride a ride, so tell
	 *  them they’re wrong.
	 */
	
	public static void main(String[] args) {
		int num = (int) (Math.random() * 10) + 1;
		if (num < 6) {
			System.out.println("You are too short.");
		} else {
			System.out.println("You can ride.");
		}
		

	}

}
