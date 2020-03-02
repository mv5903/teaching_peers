package projects4;

import java.util.Scanner;

public class SentinelDemo {
	
	/*
	 *  Allow the user to keep inputting values until
	 *  the sentinel value -100 is entered, which ends the 
	 *  program. The values will be inputted as ints. 
	 *  With each value, treat it as a temperature in 
	 *  Fahrenheit; if the temperature is above freezing, 
	 *  below freezing, or boiling, indicate so once the 
	 *  user enters a temperature.
	 */

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter a temperature: ");
		int input = kbd.nextInt();
		while (true) {
			if (input == -100) {
				System.out.println("Program terminated.");
				break;
			} else if (input < 32) {
				System.out.println("Too cold!");
			} else if (input > 212) {
				System.out.println("Too hot!");
			} else {
				System.out.println("Nice temperature.");
			}
		}
		kbd.close();

	}

}
