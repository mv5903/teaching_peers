package gettingIntoAPCS;

public class MathClass {

	public static void main(String[] args) {
/*
 * There are so many things you can do with math that are already implemented in Java! Some of them are obvious, and
 * some may need some explaining. Below are the main ones you will need:
 */
		double d = 5.78; //<--We will use this variable to manipulate the different items in the math class.
		
		d = Math.random(); //<--This assigns d to a random number between 0.0000 to approximately .9999
		System.out.println(Math.abs(d));//<--Prints the absolute value of d.
		System.out.println(Math.acos(d));//<--Prints the arccos of d. There is also asin and atan.
		System.out.println(Math.ceil(d));//<--Stands for ceiling, rounds d up to the nearest integer.
		System.out.println(Math.cos(d));//<--Finds the cosine of d. There is also tan and sin.
		System.out.println(Math.floor(d));//<--Rounds d down to the nearest integer.
		System.out.println(Math.log(d));//<--Prints log of d.
		System.out.println(Math.max(5.0, d));//<--Will print the max value of two numbers.
		System.out.println(Math.min(5.0, d));//<--Will print the min value of two numbers.
		System.out.println(Math.pow(d, 2));//<--How to use exponenets. First item (d) is the base, second (2) is what it is raised to.
		System.out.println(Math.sqrt(d));//<--Prints the square root of d.
		System.out.println(Math.toRadians(d));//<--Converts d to radians.
		System.out.println(Math.toDegrees(d));//<--Converts d to degrees.

	}

}
