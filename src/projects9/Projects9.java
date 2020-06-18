package projects9;

public class Projects9 {

//See projects9.docx for detailed instructions.	
	
	public static void main(String[] args) {
		questionOne();
		questionTwo();
		questionThree();
		questionFour();
		questionFive();
	}
	public static void questionOne() {
		double a = Math.random()*301;
		double b = Math.random()*301;
		System.out.println("One: " + convertTemps(a, b));
	}
	public static void questionTwo() {
		int a = (int) (Math.random() * 5) + 1;
		int b = (int) (Math.random() * 5) + 1;
		int c = (int) (Math.random() * 5) + 1;
		System.out.println("Two: " + checkThree(a, b, c));
	}
	public static void questionThree() {
		int x1 = (int) (Math.random() * 20) + 1;
		int y1 = (int) (Math.random() * 20) + 1;
		int x2 = (int) (Math.random() * 20) + 1;
		int y2 = (int) (Math.random() * 20) + 1;
		midpoint(x1, y1, x2, y2);
	}
	public static void questionFour() {
		int n = (int) (Math.random() * 100) + 1;
		System.out.println("Four: " + chargeLevel(n));
	}
	public static void questionFive() {
		int time = (int) (Math.random() * 2401);
		System.out.println(bedtime(time));
	}
	
	public static double convertTemps(double a, double b) {
		return ((a*b) - (32)) / 1.8;
	}
	public static boolean checkThree(int a, int b, int c) {
		if (a == b || b == c || c == a) {
			return true;
		}
		return false;	
	}
	public static void midpoint(int x1, int y1, int x2, int y2) {
		System.out.println("Three: (" + (x1 + x2) / 2 + ", " + (y1 + y2) / 2 + ")");
	}
	public static String chargeLevel(int n) {
		if (n >= 80) {
			return "Charged Sufficiently";
		} else if (n < 20) {
			return "Low Battery!";
		} else {
			return n + "%";
		}
	}
	public static String bedtime(int n) {
		if (n >= 1800 && n <= 2400) {
			return "You should be in bed right now";
		} else {
			return "You can still be awake!";
		}
	}

}
