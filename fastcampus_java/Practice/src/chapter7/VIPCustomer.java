package chapter7;

public class VIPCustomer extends Customer {

	double salesRatio;
	private int agentID;

	public VIPCustomer() {
		initCustomer();
	}

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);

		initCustomer();
		this.agentID = agentID;
	}

	private void initCustomer() {

		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;

	}

	public String showCustomerInfO() {
		return super.showCustomerInfo() + "��� ���� ��ȣ��" + agentID + "�Դϴ�";
	}
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * salesRatio);
	}

	

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

}
