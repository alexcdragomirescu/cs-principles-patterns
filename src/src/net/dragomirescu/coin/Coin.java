package net.dragomirescu.coin;

public class Coin {
	private static int coin;
	private static Coin instance = new Coin();

	private Coin() {
		// private constructor
	}

	public static Coin getInstance() {
		return instance;
	}
	
	public static int getCoin() {
		return coin;
	}
	
	public static int addCoin(int n) {
		return coin += n;
	}
	
	public static int deductCoin(int n) {
		return coin -= n;
	}

}
