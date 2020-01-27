package cooperation;

public class Taxi {
	int TaxiNumber;
	int passengerCount;
	int money;
	
	public Taxi(int TaxiNumber) {
		this.TaxiNumber = TaxiNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	
	public void showTaxiInfo() {
	System.out.println(TaxiNumber + "번 기차의 승객은" + passengerCount + "명 이고, 수익은 " + money + "입니다.");
	}
}
