package gettingIntoAPCS;

public class RelationalAndLogicalOperators {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		boolean isTrue;
// What is a relational operator?
/*
 * Relational operators are used for comparisons like you would in any math class. Is a less than or equal to
 * b? Find out by pressing the run button.		
 */
		System.out.println(a <= b);
		
/*
 * Since a is less than or equal to b, this statement will print as true. Here, you are essentially printing
 * out the boolean value represting the result of the inequality. Here are all the relational operators, 
 * explained:
 * 
 * 		a <= b   <-- Less than or equal to
 * 		a <  b   <-- Less than
 *      a == b   <-- Equal to
 *      a >  b   <-- Greater than
 *      a >= b   <-- Greater than or equal to
 *      a != b   <-- Not equal to 
 *      
 * What is a logical opertor?
 * 
 * Commonly used in if statements or loops, it is used as a condition for a certain code to ran. Here is an
 * example of what this is best used for:
 */
		if (a < b || a > b) {
			//The code here will always be executed unless the numbers are equal since a > b or a < b
		} 
/*
 * All logical operators include:
 * 
 * 		|| <--Or (Only one has to be true)
 *      && <--And (Both must be true)
 *      ^  <--Exclusive Or (One must be true and one must be false). This is rarely used and is not in APCSA but is useful to know
 * 
 * Now go compare things!
 */
		
	}

}
