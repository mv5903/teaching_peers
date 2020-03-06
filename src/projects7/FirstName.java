package projects7;

import java.util.Scanner;

/*
 * Have the user enter a first and last name as one String. 
 * Not separate Strings, otherwise that’s cheating :). 
 * Write this program that will get the first name in the 
 * String and print it out. See the projects7.docx for an
 * example input/output table.
 */

public class FirstName {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter your full name: ");
		String name = kbd.nextLine(), firstName = "";
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ' ') {
			    firstName = name.substring(0, i);
				break;
			}
		}
		System.out.println(firstName);
		kbd.close();
	}

}
