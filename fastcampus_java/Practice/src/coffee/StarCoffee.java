package coffee;

public class StarCoffee {
	
	int money;
	
	public String brewing(int money) {
		
		this.money += money;
		if(money == Menu.STARAMERICANO) {
			return "�� �ٹ� �Ƹ޸�ī�� ����";
		}
		else if(money == Menu.STARLATTE) {
			return "�� �ٹ� ��� ����";
		}
		else {
			return null;
		}
	}

}
