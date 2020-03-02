package projects5;

import java.util.Scanner;

public class LengthOfString {
	
/*
 * Design a program that shows the length of any inputted 
 * String. Hint, Java already has a method for this in the
 * String class.	
 */
	
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String n = kbd.nextLine();
		System.out.println("Length of String: " + n.length());
		kbd.close();
	}
}
