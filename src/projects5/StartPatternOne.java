package projects5;

import java.util.Scanner;

public class StartPatternOne {

	/*
	 * Print out a pattern, where the middle row represents
	 * the number entered by the user. Example with 4:
	 * *
	 * **
	 * ***
	 * ****
	 * ***
	 * **
	 * *
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int count = kbd.nextInt();
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = count-1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		kbd.close();
	}

}
