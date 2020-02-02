package inheritance;

public class VIPCustomer extends Customer{
	
	double salesRatio;
	private int agentID;

	public VIPCustomer() {
		
//		customerGrade = "VIP";
//	 	private -> 상속관계에서 접근안됨
//		외부에선 private이지만 상속관계에서는 접근 가능하게 하려면 protected사용
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
}
