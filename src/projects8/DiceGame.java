package projects8;

public class DiceGame {

/*
 *  Make a game that generates a random number between 1 and 6 repeatedly. Keeping track 
 *  of the number of times you roll, add that random number to a total only if the number is 3 or less, 
 *  or if it is exactly 6. Once the total hits 100, print out the number of rolls it took to reach 100 
 *  under these restrictions.
 */
	public static void main(String[] args) {
		int randomNumber;
		int total = 0;
		int count = 0;
		while (true) {
			if (total == 100) {
				break;
			}
			randomNumber = (int) (Math.random() * 6) + 1;
			if (randomNumber <= 3 || randomNumber == 6) {
				total+=randomNumber;
			}
			count++;
		}
		System.out.println("It took " + count + " numbers to get to 100");

	}

}
