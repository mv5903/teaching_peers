package projects2;

import java.util.Scanner;

public class Calculator {

/*
 * Make a method-based calculator program that incorperates an add, 
 * subtract, multiply, divide, and exponents.	
 */
	
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		String operation = "add";
		System.out.println("Enter a number: ");
		double a = kbd.nextDouble();
		System.out.println("Enter another number: ");
		double b = kbd.nextDouble();
		if (operation.equalsIgnoreCase("add")) {
			add(a, b);
		} else if (operation.equalsIgnoreCase("subtract")) {
			subtract(a, b);
		} else if (operation.equalsIgnoreCase("multiply")) {
			multiply(a, b);
		} else if (operation.equalsIgnoreCase("divide")) {
			divide(a, b);
		} else if (operation.equalsIgnoreCase("powers")) {
			powers(a, b);
		}
		kbd.close();

	}
	
	public static void add(double a, double b) {
		System.out.println(a+b);
	}
	public static void subtract(double a, double b) {
		System.out.println(a-b);
	}
	public static void multiply(double a, double b) {
		System.out.println(a*b);
	}
	public static void divide(double a, double b) {
		System.out.println(a/b);
	}
	public static void powers(double a, double b) {
		System.out.println(Math.pow(a, b));
	}

}
