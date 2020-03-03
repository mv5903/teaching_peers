package gettingIntoAPCS;

//Be sure to import the following package:
import java.util.Random;


public class RandomClass {
	public static void main(String[] args) {
		Random rdm = new Random();
		
		int n = rdm.nextInt(5) + 2; //Will print a random number between 2 and 7.
/*                 ^        ^    ^
 *                 |        |   adds 2.
 *                 |        |
 *                 |    Number between
 *                 |    0 and 4.
 *                 |
 *                 |
 *                 |
 *                 |  
 *         Look familiar?
 *         Same thing as 
 *         Scanner! 
*/
/*
 * You really don't need to use this. The most effective way to generate numbers is as follows:
 */
		double d = Math.random() * 5 + 2; //Works the same way as above, but instead prints it as a double
		
		int a = (int) (Math.random() * 5) + 2; //Want to create a random integer? Just cast it to an integer.
 		
		
		
	}
}
