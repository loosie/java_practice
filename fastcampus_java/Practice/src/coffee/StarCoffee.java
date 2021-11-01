package coffee;

public class StarCoffee {
	
	int money;
	
	public String brewing(int money) {
		
		this.money += money;
		if(money == Menu.STARAMERICANO) {
			return "별 다방 아메리카노 구입";
		}
		else if(money == Menu.STARLATTE) {
			return "별 다방 라뗴 구입";
		}
		else {
			return null;
		}
	}

}
