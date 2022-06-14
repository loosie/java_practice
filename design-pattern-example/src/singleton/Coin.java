package singleton;

public class Coin {

	private static final int ADD_MORE_COIN = 10;
	private int coin;
	private static Coin instance = new Coin();

	private Coin(){
		// private 생성자로 선언하여 상속을 방지한다.
	}

	public static Coin getInstance(){
		return instance;
	}

	public int getCoin(){
		return coin;
	}

	public void addMoreCoin(){
		coin += ADD_MORE_COIN;
	}

	public void deductCoin(){
		coin--;
	}
}

