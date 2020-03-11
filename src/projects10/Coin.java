package projects10;

public class Coin {
	private boolean isHeads;
	private double faceValue;
	
	public Coin() {
		flipCoin();
		faceValue = ((int) (Math.random() * 100)) / 100.0;
	}
	
	public Coin(boolean isHeads, double faceValue) {
		this.isHeads = isHeads;
		this.faceValue = faceValue;
	}
	
	public void flipCoin() {
		isHeads = Math.random() < 0.5;
	}
	
	public boolean getHeads() {
		return isHeads;
	}
	public double getFaceValue() {
		return faceValue;
	}
	public void setHeads(boolean isHeads) {
		this.isHeads = isHeads;
	}
	public void setFaceValue(double faceValue) {
		this.faceValue = faceValue;
	}
	public String toString() {
		return "Face: " + isHeads + "\tValue: " + faceValue;
	}
}
