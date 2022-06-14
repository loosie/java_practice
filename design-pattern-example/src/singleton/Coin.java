package singleton;

public class Coin {

	private static final int ADD_MORE_COIN = 10;
	private int coin;
	private static Coin instance;

	private Coin(){
		// private 생성자로 선언하여 상속을 방지한다.
	}

	// 정적 블럭 초기화
	public static Coin getInstance(){
		if(instance == null){
			instance = new Coin();
		}
		return instance;
	}

	public int getCoin(){
		return coin;
	}

	public void addMoreCoin(){
		coin += ADD_MORE_COIN;
	}

	// insertCoin이 현재 코인보다 적거나 같은 경우에만 동작한다.
	public void deductCoin(int insertCoin){
		if(coin >= insertCoin){
			try{
				Thread.sleep(1000);
			}catch (InterruptedException ex){
			}
			coin -= insertCoin;
		}
	}
}

