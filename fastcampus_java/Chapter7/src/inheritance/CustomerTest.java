package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		
	/*	Customer c1 = new Customer();
		c1.setCustomerName("¿Ãº¯Ω≈");
		c1.setCustomerID(10010);
		c1.bonusPoint = 1000;
		
		System.out.println(c1.showCustomerInfo());
		*/
		VIPCustomer v1 = new VIPCustomer(10020,"±Ë¿ØΩ≈");
//		v1.setCustomerName("±Ë¿ØΩ≈");
//		v1.setCustomerID(10020);
		v1.bonusPoint = 10000;
		
		System.out.println(v1.showCustomerInfo());
	}
}
