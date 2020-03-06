package projects7;

import java.util.Scanner;

public class PythagoreanTheorem {

	public static void main(String[] args) {	
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter a: ");
		double a = kbd.nextDouble();
		System.out.println("Enter b: ");
		double b = kbd.nextDouble();
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		System.out.println("Hypotenuse: " + c);
		kbd.close();
	}

}
