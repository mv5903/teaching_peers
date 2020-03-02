package projects4;

import java.util.Scanner;

public class DecimalToBinary {

/*
 * Print a number decimal number in binary.
 */
	
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter a number in decimal: ");
		long input = kbd.nextLong();
		System.out.println();
		long i = 1;
		while (i < input) { //find highest number
			i*=2;
		}
		while (i >= 1) {
			if (input >= i) {
				System.out.print(1);
				input-=i;
			} else {
				System.out.print(0);
			}
			i/=2;
		}
		kbd.close();

	}

}
