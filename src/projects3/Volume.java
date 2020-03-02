package projects3;

import java.util.Scanner;

public class Volume {

/*
 * Have user input a length, width, and height of a square. 
 * Then print out the volume.
 */
	
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter length: ");
		double length = kbd.nextDouble();
		System.out.println("Enter width: ");
		double width = kbd.nextDouble();
		System.out.println("Enter height: ");
		double height = kbd.nextDouble();
		System.out.println("Area: " + (length*width*height));
		kbd.close();
	}

}
