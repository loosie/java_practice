package coffee;

public class BeanCoffee {
	
	int money;
	
	public String brewing(int money) {
		
		this.money += money;
		if(money == Menu.BEANAMERICANO) {
			return "�� �ٹ� �Ƹ޸�ī�� ����";
		}
		else if(money == Menu.BEANLATTE) {
			return "�� �ٹ� ��� ����";
		}
		else {
			return null;
		}
	}
}
