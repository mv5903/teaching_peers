package projects6;

public class NameInATable {
	
/*
 * Write a program that prints your first and last name
 * in a 3x3 table.	
 */

	public static void main(String[] args) {
		String name = "Matthew Vandenberg"; //replace with your first and last name
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(name + "\t"); //\t is for tab, this is optional
			}
			System.out.println();
		}

	}

}
