package projects1;

import java.util.Scanner;

public class FavoriteColor {
/*
 * Ask user for their favorite color. Your favorite color is blue. Ensure 
 * that if they enter a color other than blue, they are wrong. Print a 
 * message telling them that.
 */
	public static void main(String[] args) {
	    final String COLOR = "blue";
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter a color.");
		String input = kbd.nextLine();
		if (input.equals(COLOR)) {
			System.out.println("Yes! That is my favorite color!");
		} else {
			System.out.println("That is not my favorite color. Try again.");
		}
		kbd.close();
	}

}
