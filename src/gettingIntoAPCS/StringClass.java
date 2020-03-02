package gettingIntoAPCS;

public class StringClass {

	public static void main(String[] args) {
/*
 * Remember Strings? They store words or other characters. There are ton of things that can be done with Strings.
 * Below are the main ones you will need.
 */
		String a = "Hello";
		String b = "World";
		
		System.out.println(a.charAt(0)); //Strings have locations in memory. Each elements has something called an index.
										//The indexes start at 0 and go to the length of the string minus 1. In this example,
		                               //the letter H will be printed because at location 0 in Hello, there is an H.
		
		System.out.println(a.compareTo(b));//Prints out an integer comparing them alphabetically. If it returns a negative 
		                                   //number (which it will in this case), that indicates that the entire String comes
		                                   //before the other in the alphabet, in this case b. This is comparing their decimal
		                                   //unicode values, which can be found in the readme.
		
		System.out.println(a.equals(b));//If the two Strings equal each other, then "true" will print. Since they don't equal
		                                //each other in this case, "false" will instead print.
		
		System.out.println(a.equalsIgnoreCase(b));//Same as above, but ignores the casing.
		
		System.out.println(a.contains("Hel"));//Since "Hel" is in a, it will return true.
		
		System.out.println(a.indexOf("l"));//This prints the index of where the first l is found in "Hello".
		
		System.out.println(a.lastIndexOf("l"));//Same as preivous, but instead prints last index of where l is found.
		
		System.out.println(a.length());//Prints the length of the String.
		
		System.out.println(a.substring(0, 2));//Prints a String containing the indexes [0, 2). <--Includes first value, exludes second.
		
		System.out.println(a.toUpperCase());//Prints "Hello" in all upper case.
		
		System.out.println(a.toLowerCase());//Prints "Hello" in all lower case.
		
		
		
		
	}

}
