package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		
		Customer c1 = new Customer(10010,"�̼���");
		c1.bonusPoint = 1000;
		
		
		VIPCustomer v1 = new VIPCustomer(10020,"������");
		v1.bonusPoint = 10000;
		
		int price1 = c1.calcPrice(10000);
		int price2 = v1.calcPrice(10000);
		
		System.out.println(c1.showCustomerInfo()+ "���� �ݾ���" + price1+" �� �Դϴ�.");
		System.out.println(v1.showCustomerInfo()+ "���� �ݾ���" + price2+" �� �Դϴ�.");

		Customer customerNo = new VIPCustomer(10030,"����");
		customerNo.bonusPoint = 10000;
		
		System.out.println(customerNo.showCustomerInfo()+ "���� �ݾ���" + customerNo.calcPrice(10000)+" �� �Դϴ�.");
		System.out.println(customerNo.showCustomerInfo());
	}
}
