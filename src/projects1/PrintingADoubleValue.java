package projects1;

import java.util.Scanner;

public class PrintingADoubleValue { //Ask the user for a double variable. 
	//Then, convert it into an integer and print it out (Use casting).

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double input = kbd.nextDouble();
		System.out.println("Number: " + ((int) (input)));
		kbd.close();
	}

}
