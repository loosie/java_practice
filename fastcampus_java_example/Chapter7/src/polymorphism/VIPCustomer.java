package polymorphism;

public class VIPCustomer extends Customer{
	
	
	double salesRatio;
	private int agentID;

	/*
	public VIPCustomer() {
		
//		customerGrade = "VIP";
//	 	private -> 상속관계에서 접근안됨
//		외부에선 private이지만 상속관계에서는 접근 가능하게 하려면 protected사용
	
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() 생성자 호출");
	}
	*/
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);

		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int,String) 생성자 호출");
	}
	
//	overriding
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price *salesRatio);
	}
	

	
}
