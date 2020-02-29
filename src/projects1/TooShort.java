package projects1;

import java.util.Scanner;

public class TooShort {
/*
 * Ask user for their height in inches. 6 feet or taller is considered the
 * correct height in order to enter the rollercoaster ride they are about
 * to go on. If their heigh is shorter than that, let them know. They 
 * cannot ride!
 */
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter your height in inches: ");
		double inches = kbd.nextDouble();
		if (inches / 12 < 6) {
			System.out.println("Sorry. Too short to ride.");
		} else {
			System.out.println("You can ride!");
		}
		kbd.close();
	}

}
