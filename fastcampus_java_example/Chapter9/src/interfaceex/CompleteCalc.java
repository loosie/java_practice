package interfaceex;

public class CompleteCalc extends Calculator {

	@Override
	public int mul(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int div(int num1, int num2) {
		if(num2 ==0)
			return ERROR;
		else
			return num1/num2;
	}

	
	public void showInfo() {
		System.out.println("��� ���� ��.");
	}

	/*
	public void description() {
		System.out.println("������ �� description");
	}
	*/
}
