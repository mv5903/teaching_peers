package projects1;

import java.util.Scanner;

public class PrintingFirstAndLastNameTogether {
//Print your first and last name together. Use user
//input to collect first and last name.
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter your first name:");
		String first = kbd.nextLine();
		System.out.println("Enter your last name:");
		String last = kbd.nextLine();
		System.out.println(first + " " + last);
		kbd.close();

	}

}
