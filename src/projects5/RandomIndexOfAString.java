package projects5;

public class RandomIndexOfAString {

/*
 * Design a program that displays a character at a random 
 * index using charAt (remember, this has to be between 0 
 * and the length). Be sure to print out this character 
 * along with the randomly generated index.	
 */
	
	public static void main(String[] args) {
		String str = "Hello World";
		int random = (int) (Math.random() * str.length());
		System.out.println("Random character " + str.charAt(random) + " at index " + random);

	}

}
