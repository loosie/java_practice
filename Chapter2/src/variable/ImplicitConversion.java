package variable;

public class ImplicitConversion {
	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum;
//		묵시적 형변환
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		
		int iNum2 = 20;
		float fNum = iNum2;
//		덜 정밀 -> 더 정밀한 수
		System.out.println(iNum2);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
//		두번의 형변환
//		1. iNum 이 float로 형변환
//		2. fNum + iNum이 double로 형변환
		System.out.println(dNum);
	}
}
