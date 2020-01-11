package operator;

public class OperatorEx4 {

	public static void main(String[] args) {

		int num1 = 0B00001010; // 10
		int num2 = 0B00000101; // 5

		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);

		System.out.println(num2 << 3);
		System.out.println(num2);

//		값 바꾸기 위해선 복합대입 연산자
//		System.out.println(num2 <<= 3); 40
//		System.out.println(num2); 40
		
		System.out.println(num2 >>  1);
		
		
	}

}
