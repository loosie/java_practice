package coffee;

public class StarCoffee {
	
	String CoffeeName;
	int passengerCount;
	int money;
	
	public StarCoffee(String CoffeeName) {
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
