package projects1;

import java.util.Scanner;

public class AskToPerformOperation {
/*
 * Ask the user whether they’d like to add, 
 * subtract, multiply, or divide. Then ask for two
 *  numbers of type double, and then print out the 
 *  corresponding result based on their chosen 
 *  operation. (Note: This is before learning how
 *  to use methods and functions).
 */
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
		int selection = kbd.nextInt();
		System.out.println("Enter your first number: ");
		int first = kbd.nextInt();
		System.out.println("Enter your second number: ");
		int second = kbd.nextInt();
		if (selection == 1) {
			System.out.println("The sum is " + (first+second));
		} else if (selection == 2) {
			System.out.println("The difference is " + (first-second));
		} else if (selection == 3) {
			System.out.println("The product is " + (first*second));
		} else if (selection == 4) {
			//numbers must be converted to type double, otherwise integer
			//division will instead be performed.
			double a = first;
			double b = second;
			System.out.println("The quotient is " + (a/b));
		}
		kbd.close();

	}

}
