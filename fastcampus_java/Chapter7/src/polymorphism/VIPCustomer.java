package polymorphism;

public class VIPCustomer extends Customer{
	
	
	double salesRatio;
	private int agentID;

	/*
	public VIPCustomer() {
		
//		customerGrade = "VIP";
//	 	private -> ��Ӱ��迡�� ���پȵ�
//		�ܺο��� private������ ��Ӱ��迡���� ���� �����ϰ� �Ϸ��� protected���
	
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() ������ ȣ��");
	}
	*/
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);

		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int,String) ������ ȣ��");
	}
	
//	overriding
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price *salesRatio);
	}
	

	
}
