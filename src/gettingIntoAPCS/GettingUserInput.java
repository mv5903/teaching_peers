package gettingIntoAPCS;

/*
 * When getting user input, you need to use this section of the class, like discussed earlier, to
 * import something called Scanner. Look below for what to type here:
 */

import java.util.Scanner;


public class GettingUserInput {

	public static void main(String[] args) {
		
/*
 * Scanner is used to take user input. It also has some other purposes like reading from files,
 * but in APCSA, all we use it for is to get user input. You will need to memorize this statement 
 * below. 
 */
		Scanner kbd = new Scanner(System.in);
/*
 * Scanner is an object. kbd refers to the name of the Scanner object. Whenever you want to get user input
 * later on, you always use kbd to refer to keyboard input. kbd can be named something else, but for now,
 * let's keep it this way.
 * 
 * In order to utilize the keyboard in your program, you'll need to use it in your program as if it were
 * a variable. For instance, typing the following below will allow you to store whatever you type as the 
 * String variable str.	
 */
		String str = kbd.nextLine();
/*
 * When you use the Scanner to get user input, you must also remember to use the correct method for the 
 * certain data type you are using. Notice how all of the following are different from each other. If you
 * were to type letters into an nextInt(), you will get an error when running the program. See below:		
 */
		int n = kbd.nextInt();
		double d = kbd.nextDouble();
		byte b = kbd.nextByte();
		
/*
 * ..and so on. When you are finished using Scanner, remember to close it by using the syntax below.
 * This is to prevent vulnerabilities in your code which could get compromised. This isn't too crucial, 
 * but you should still type it at the end of your code.
 */
		kbd.close();
		

	}

}
