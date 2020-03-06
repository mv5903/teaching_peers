package projects7;

import java.util.Scanner;

public class FirstName {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter your full name: ");
		String name = kbd.nextLine(), firstName = "";
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ' ') {
			    firstName = name.substring(0, i);
				break;
			}
		}
		System.out.println(firstName);
		kbd.close();
	}

}
