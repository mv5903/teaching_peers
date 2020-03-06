package projects7;

public class HeronsFormula {
	
/*
 * Write a program that will find the area of a triangle 
 * using Heron’s Formula, as shown below:
 * S=(a+b+c)/2
 * Area= Square root of [ S(S-A)(S-B)(S-C)) ]
 * Use 10, 13, and 11 for a, b, and c respectively. If you 
 * did it right, the area should be about 53.441 units^2.
 *
 */

	public static void main(String[] args) {
		int a = 10;
		int b = 13;
		int c = 11;
		
		double s = (a + b + c) / 2;
		
		double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
		System.out.println("Area: " + area);

	}

}
