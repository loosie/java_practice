package variable;

public class ImplicitConversion {
	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum;
//		������ ����ȯ
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		
		int iNum2 = 20;
		float fNum = iNum2;
//		�� ���� -> �� ������ ��
		System.out.println(iNum2);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
//		�ι��� ����ȯ
//		1. iNum �� float�� ����ȯ
//		2. fNum + iNum�� double�� ����ȯ
		System.out.println(dNum);
	}
}
