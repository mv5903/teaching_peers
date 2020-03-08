package projects8;

import java.util.Scanner;

public class LastName {
	
/*
 * Write a program that allows the user to enter a String representing their name, 
 * then print the last name back at them.
 */
	
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter Full Name: ");
		String name = kbd.nextLine();
		System.out.println("Your Last Name: " + name.substring(name.indexOf(" ")));
		kbd.close();
	}

}
