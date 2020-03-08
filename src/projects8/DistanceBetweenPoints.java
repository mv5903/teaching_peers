package projects8;

public class DistanceBetweenPoints {
	
/*
 * Write a program to calculate the distance between two points. 
 * Randomly generate x1, x2, y1, and y2 as integers.	
 */
	
	public static void main(String[] args) {
		int x1 = (int) (Math.random() * 100) + 1;
		int x2 = (int) (Math.random() * 100) + 1;
		int y1 = (int) (Math.random() * 100) + 1;
		int y2 = (int) (Math.random() * 100) + 1;
		double distance = Math.sqrt(Math.pow(y2-y1, 2) + Math.pow(x2-x1, 2));
		System.out.println("Distance: " + distance);
	}
}
