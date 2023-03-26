package net.dragomirescu.test;
import net.dragomirescu.coin.Coin;

public class Test {
	
	public static void main(String[] args) {
		Coin coin = Coin.getInstance();
		coin.addCoin(50);
		System.out.println(coin.getCoin());
		coin.deductCoin(20);
		System.out.println(coin.getCoin());
	}
}
