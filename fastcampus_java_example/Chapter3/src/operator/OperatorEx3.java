package operator;

public class OperatorEx3 {

	public static void main(String[] args) {

		int score = 100;

		System.out.println(++score); // 101
		System.out.println(score++); // 101
		System.out.println(score); // ���� �������� ���� 102
		System.out.println(--score); // 101
		System.out.println(score--); // 101
		System.out.println(score); // ���� �������� ���� 100

		/*
		 * ���� ,�� ������
		 */

		int num1 = 10;
		int i = 2;

		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(num1);
		System.out.println(i); // �տ� ���Ǹ� ���� �ٷ� ���߱� ������ ���� x --------> �ܶ�ȸ����
		System.out.println(value);

		boolean value2 = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10);
		System.out.println(num1);
		System.out.println(i); // false or ture �̹Ƿ� �ڿ� ���� �Ͽ� ��� 4   --------> �ܶ�ȸ����
		System.out.println(value2);

		/*
		 * ���� ������
		 */
		int num2 = 10;
		int num3 = 20;
		int max =  (num2>num3)?num2:num3;
		
		System.out.println(max);
	}

}
