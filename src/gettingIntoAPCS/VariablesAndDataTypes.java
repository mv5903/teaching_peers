package gettingIntoAPCS;

import java.io.UncheckedIOException;

public class VariablesAndDataTypes {
	public static void main(String[] args) {

/*
 * In Java, there are different types of variables that store different types of information.
 * 
 * Refer to my datatypes.png for the different memory sizes of each data type.
 * 
 */
	String str = "Hello World"; //<--Stores multiple characters into one variable called str.
	int n = 5; //<--Stores the integer 5 in a variable called n.
	double d = 5.0; //<--Stores a double value as d. Doubles consist of a number with a decimal in it.
	char c = 'w'; //<--Stores the character w as c. Note how this uses single quotes instead of double.
	boolean isTrue = true; //<--Stores true or false. That's it.
	
	//More uncommonly used data types:
	byte b = 1;
	short s = 6354;
	long l = 346246246;
	
	float f = 1.45f; //<--Note the f after the number.
	
	/*
	 * In Java, many data types can easily be casted (converted) into another data type. For instance, you won't
	 * see an error when attempting to type the following statement:
	 */
	double dbl = n;
	
	/*
	 * Basically, this is taking the variable n (this is an integer, as we initialized it above) and casting it
	 * to a double called dbl. This works perfectly fine as you are converting a 32-bit data into a 64-bit data.
	 * This is called implicit casting. However, if you tried to fit larger data into smaller data, like this:
	 */
	try {
		int integer = d;
	} catch (UserException ex) {
		System.out.println("Can't implicity convert from double to int.");
	}
	
	
	/*
	 * You will see an error appear. Think of it like this. You can easily fit an iPhone into a box because it is
	 * smaller than the box. Can you do this the other way around? Nope. There is a way to override this, however,
	 * and this can be done by using the following statement:
	 */
	int p = (int) d;	
	
	/*
	 * This is called explicit casting. We are forcing the double value d into a smaller int value. 
	 * 
	 */
		
		
		
	}
}
