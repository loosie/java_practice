package chapter7;

public class GOLDCustomer extends Customer {

	double salesRatio;
	
	
	public GOLDCustomer() {
		initCustomer();
	}

	public GOLDCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		initCustomer();
	}
	
	private void initCustomer() {

		customerGrade = "GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;

	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (salesRatio * price);
	}

}
