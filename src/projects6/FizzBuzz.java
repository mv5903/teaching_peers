package projects6;

public class FizzBuzz {

/*
 * If a randomly generated number from 0 to 100 
 * is divisible by both three and five, print 
 * “fizz-buzz”. If a number is divisible only by three, 
 * print “fizz”. If the number is divisible only by five, 
 * print “buzz”. 	
 */
	
	public static void main(String[] args) {
		int n = (int) (Math.random() * 101);
		String str = "none";
		if (n % 3 == 0 && n % 5 == 0) {
			str = "FizzBuzz";
		} else if (n % 3 == 0) {
			str = "Fizz";
		} else if (n % 5 == 0) {
			str = "Buzz";
		}
		
		System.out.println(n + ": " + str);
	}

}
