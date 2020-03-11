package projects10;

public class BiggerCoins {

	public static void main(String[] args) {
		int count = 0;
		Coin c;
		for (int i = 0; i < 100; i++) {
			c = new Coin();
			if (c.getFaceValue() > .25 && c.getHeads()) {
				count++;
			}
		}
		System.out.println("Count: " + count);

	}

}
