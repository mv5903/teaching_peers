package gettingIntoAPCS;

public class ForLoops {
	public static void main(String[] args) {

/*
 * Yes, you could just do the following if you really wanted:
 * 
 */
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		
/*
 * But the problem with this is that it takes way too much space. Consider using something called a for loop.
 * In a for loop, you can decide how many times a bunch of code runs with the conditions you set for it. See
 * below:
 */
		
	//      a      b    c                       		      
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello World");
		}
		
		/*
		 * a). Where the loop will start from
		 * b). The condition to check for (for now this is how many times it will run)
		 * c). How much the loop will increment after each time the code in the block runs
		 *     (for now, leave this as i++ which is i = i + 1)
		 */

/*
 * A new int variable i is created in order to keep track of how many times a block of code runs. In the above example, the
 * code will print Hello World ten times. Why? It uses a counter variable i, checks if it is less than 10 (which it is), then
 * runs the code inside the curly braces. Afterwards, it then increments i by one. This continues until i becomes 10, which is
 * not less than 10. Therefore, the code will run for 0 to 9, totalling 10.		
 */
		
	}
}
