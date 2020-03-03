package projects6;

public class VowelsInAString {

/*
 * Write a program to determine whether there are an even or 
 * odd number of vowels in a String. Use the following 
 * String: “The best way to learn computer science is by 
 * practicing”.
 */
	
	public static void main(String[] args) {
		String str = "The best way to learn computer science is by practicing";
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) ==  'e'
					|| str.charAt(i) == 'o' || str.charAt(i) == 'i'
					|| str.charAt(i) == 'u') {
				counter++;
			}
		}
		System.out.println("Number of vowels: " + counter);
	}

}
