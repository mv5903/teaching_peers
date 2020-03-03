package projects6;

public class DivisbleBySomething {

/*
 * Write a program that gets a random integer between 5 and
 * 15. Display the integer. If the number is divisible by
 * 2, 5, or 3, print true (as a Boolean). Otherwise, print
 * false.
 */
	public static void main(String[] args) {
		int n = (int) (Math.random() * 11) + 5;
		System.out.println("Integer: " + n);
		boolean isDivisible = false;
		if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
			isDivisible = true;
		}
		System.out.println(isDivisible);

	}

}
