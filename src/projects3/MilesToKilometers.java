package projects3;

import java.util.Scanner;

public class MilesToKilometers {
	
	/*
	 * Use user input to enter a number in miles, and have the program
	 * print that out in kilometers
	 */

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter a number in miles: ");
		double miles = kbd.nextDouble();
		System.out.println("That's " + (miles * 1.60934) + " kilometers");
		kbd.close();
	}

}
