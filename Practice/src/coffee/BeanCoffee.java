package coffee;

public class BeanCoffee {
	
	String CoffeeName;
	int passengerCount;
	int money;
	
	public BeanCoffee(String CoffeeName) {
		this.CoffeeName = CoffeeName;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(CoffeeName+"의 커피의 판매 갯수는 " + passengerCount +"개 이고, 수익은 " + money + "입니다.");
	}
}
