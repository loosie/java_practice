package chapter5;

public class MenTest {

		public static void main(String[] args) {
			
			Men m = new Men();
			m.age = 40;
			m.name = "James";
			m.isMarried = true;
			m.child = 3;
			
			System.out.println("���� :" + m.age);
			System.out.println("�̸� :" + m.name);
			System.out.println("��ȥ ���� :" + m.isMarried);
			System.out.println("�ڳ� �� :" + m.child);
			
		}
}
