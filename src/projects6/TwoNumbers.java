package projects6;

public class TwoNumbers {

/*
 * Write a program that takes two randomly generated 
 * integers between 0 and 12. If one of the numbers is 
 * greater than or equal to 8, print their difference. 
 * Otherwise, print their sum. Be sure to print out both 
 * numbers before doing this.
 */
	
	public static void main(String[] args) {
		int a = (int) (Math.random() * 13);
		int b = (int) (Math.random() * 13);
		System.out.println("a: " + a + "\nb: " + b);
		if (a >= 8 || b >= 8) {
			System.out.println(a - b);
		} else {
			System.out.println(a + b);
		}

	}

}
