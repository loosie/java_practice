package variable;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		int i = 1000;
		byte bNum = (byte)i;//명시적 형변환
		
		System.out.println(bNum);
		
		
		double dNum1 = 1.2;
		float fNum1 = 0.9F;
		
		int iNum1 = (int)dNum1 + (int)fNum1;
		int iNum2 = (int)(dNum1 + fNum1);
		
		System.out.println(iNum1);
		System.out.println(iNum2);

	}

}
