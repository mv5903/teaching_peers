package projects4;

import java.util.Scanner;

/*
 * Create a method that when called, takes two numbers as 
 * user input (from the main method), and returns the square
 *  root of their product. Remember to print out this number.
 */

public class SquareRootOfProduct {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double a = kbd.nextDouble();
		System.out.println("Enter another number: ");
		double b = kbd.nextDouble();
		System.out.println(sqrt(a, b));
	}
	
	public static double sqrt(double a, double b) {
		return Math.sqrt(a*b);
	}
}
