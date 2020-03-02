package projects5;

import java.util.Scanner;

public class FirstThreeCharacters {

/*
 * Design a program that takes a String, and outputs the
 * first three characters of it. Use substring. Remember 
 * that the first character of a String is considered the
 * 0th index, followed by the 1st, 2nd, etc.	
 */
	
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = kbd.nextLine();
		System.out.println("First three characters: " + str.substring(0, 3));
		kbd.close();
	}

}
