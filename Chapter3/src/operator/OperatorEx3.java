package operator;

public class OperatorEx3 {

	public static void main(String[] args) {

		int score = 100;

		System.out.println(++score); // 101
		System.out.println(score++); // 101
		System.out.println(score); // 위에 연산으로 인해 102
		System.out.println(--score); // 101
		System.out.println(score--); // 101
		System.out.println(score); // 위에 연산으로 인해 100

		/*
		 * 관계 ,논리 연산자
		 */

		int num1 = 10;
		int i = 2;

		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(num1);
		System.out.println(i); // 앞에 조건만 보고 바로 평가했기 때문에 연산 x --------> 단락회로평가
		System.out.println(value);

		boolean value2 = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10);
		System.out.println(num1);
		System.out.println(i); // false or ture 이므로 뒤에 연산 하여 결과 4   --------> 단락회로평가
		System.out.println(value2);

		/*
		 * 조건 연산자
		 */
		int num2 = 10;
		int num3 = 20;
		int max =  (num2>num3)?num2:num3;
		
		System.out.println(max);
	}

}
