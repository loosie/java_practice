package coffee;

public class BeanCoffee {
	
	int money;
	
	public String brewing(int money) {
		
		this.money += money;
		if(money == Menu.BEANAMERICANO) {
			return "콩 다방 아메리카노 구입";
		}
		else if(money == Menu.BEANLATTE) {
			return "콩 다방 라뗴 구입";
		}
		else {
			return null;
		}
	}
}
