package projects7;

public class HeronsFormula {

	public static void main(String[] args) {
		int a = 10;
		int b = 13;
		int c = 11;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		double s = (a + b + c) / 2;
		
		double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
		System.out.println("Area: " + area);

	}

}
