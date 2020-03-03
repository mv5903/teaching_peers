package projects4;

import java.util.Scanner;

public class BinaryToDecimal {
	
/*
 * Print any given binary number in decimal
 */
	public static void main(String[] args) {
		Scanner kbd = new Scanner( System.in );
        System.out.print("Enter a binary number: ");
        String jew = kbd.nextLine();
        System.out.println("Output in Decimal: "+Integer.parseInt(jew, 2));
        kbd.close();
	}

}
