package projects5;

import java.util.Scanner;

public class AmountOfEs {

/*
 *  Design a program that has a String containing your
 *  name. Find out how many e’s there are and print that 
 *  out to the user. Be sure that this works for any name.
 */
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter a name: ");
		String name = kbd.nextLine();
		int countE = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'e') {
				countE++;
			}
		}
		System.out.println("There are " + countE + " e's in " + name + ".");
		kbd.close();
	}

}
