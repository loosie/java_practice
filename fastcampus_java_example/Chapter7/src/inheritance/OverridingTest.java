package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		
		Customer c1 = new Customer(10010,"이순신");
		c1.bonusPoint = 1000;
		
		
		VIPCustomer v1 = new VIPCustomer(10020,"김유신");
		v1.bonusPoint = 10000;
		
		int price1 = c1.calcPrice(10000);
		int price2 = v1.calcPrice(10000);
		
		System.out.println(c1.showCustomerInfo()+ "지불 금액은" + price1+" 원 입니다.");
		System.out.println(v1.showCustomerInfo()+ "지불 금액은" + price2+" 원 입니다.");

		Customer customerNo = new VIPCustomer(10030,"나라나");
		customerNo.bonusPoint = 10000;
		
		System.out.println(customerNo.showCustomerInfo()+ "지불 금액은" + customerNo.calcPrice(10000)+" 원 입니다.");
		System.out.println(customerNo.showCustomerInfo());
	}
}
