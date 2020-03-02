package projects2;

import java.util.Scanner;

/*
 * Write a program that prints the area of the circle based upon a radius
 * from user input.
 */

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter a radius: ");
		double radius = kbd.nextDouble();
		System.out.println("Area of circle: " + (Math.PI * Math.pow(radius, 2)));
		kbd.close();
	}
}
