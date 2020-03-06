package gettingIntoAPCS;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

/*
 * Want to know how to get a certain part of your code to run only under a condition you set? To accomplish
 * this goal, we use if and else statements. Let's utilize Scanner, which we learned earlier.
 */
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int degrees = kbd.nextInt();
		
/*
 * Let's say that depending on the temperature, we want the program to tell us if the temperature is boiling, freezing, or 
 * just right. For this case, let's use Fahrenheit, where above 212 degrees is considered boiling, below 32 degrees is 
 * considered freezing, and anything in between is okay. Here's how we can implement this in our code.
 */
				
		if (degrees >= 212) {
			System.out.println("Whoa! That's boiling!");
		} else if (degrees <= 32) {
			System.out.println("Brrr! That's freezing!");
		} else {
			System.out.println("Nice temperature!");
		}
		
/*
 * Try it yourself! Run the code, then try entering in different temperatures and see what you get. 
 * 
 * You can have as many else if's that you want, just make sure they make sense logically. For example, you could have
 * also written ->> else if (degrees > 32 && degrees < 212) <<-, but that is not necessary. It will work, but there's no
 * need for it when an else can handle that just fine.
 */
		
		kbd.close(); //<--Don't forget to close Scanner when you're done with it!

	}

}
