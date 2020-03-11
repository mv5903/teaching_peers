package projects10;

public class HasVowels {

	public static void main(String[] args) {
		String str = "";
		for (int i = 0; i < 30; i++) {
			if ((int) (Math.random() * 2) == 1) {
				str+=(char)((int)(Math.random()* 26) + 'a');
			} else {
				str+=(char)((int)(Math.random()* 26) + 'A');
			}
		}
		System.out.println("Lowercase vowels: "+numberOfVowels(str));
	}
	
	public static int numberOfVowels(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'i' || str.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}

}
