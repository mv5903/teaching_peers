package projects10;

public class WhatAreTheChances {

	public static void main(String[] args) {
		Coin c;
		int count = 0;
		for (int i = 0; i < 100; i++) {
			c = new Coin();
			if (c.getFaceValue() < .3 && !c.getHeads()) {
				count++;
			}
		}
		System.out.println("Count: " + count);

	}

}
