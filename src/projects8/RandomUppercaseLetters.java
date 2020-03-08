package projects8;

public class RandomUppercaseLetters {

/*
 * Generate random uppercase letters, and then add 10 of them to a string. Print it out afterwards. 
 * Remember to use the decimal Unicode char values from earlier in this series.	
 */
	
	public static void main(String[] args) {
		String str = "";
		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 26) + 65;
			char c = (char) num;
			str+=c;
		}
		System.out.println(str);

	}

}
