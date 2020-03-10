package projects8;

public class RemoveLetters {

/* Write a program that removes any letters before the lowercase letter m in a string. 
 * Use “I like to code in Java” as an example. Be sure to print out the new string afterwards.	
 */
	
	public static void main(String[] args) {
		String str = "I like to code in Java";
		String newString = "";
		for (int i = 0; i < str.length(); i++) {
			if ((int) (str.charAt(i)) >= 109){
				newString+=str.charAt(i);
			}
		}
		System.out.println(newString);
	}

}
