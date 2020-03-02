package projects4;

public class FindQuarter {
	
/*
 *  Keep generating numbers between 0 to 1.00 until it detects
 *  a quarter. When it does, print out the amount of times 
 *  it took to get 0.25. Note: Use (int) (Math.random() * 100) / 100.0)	
 */
	
	public static void main(String[] args) {
		double n = (int) (Math.random() * 100) / 100.0;
		System.out.println(n);
		int count = 0;
		while (true) {
			count++;
			if (n == .25) {
				System.out.println("Quarter detected. Terminating.");
				System.out.println("Took " + count + " tries.");
				break;
			}
			n = (int) (Math.random() * 100) / 100.0;
			System.out.println(n);
		}
	}
}
