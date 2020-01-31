package chapter5;

public class MenTest {

		public static void main(String[] args) {
			
			Men m = new Men();
			m.age = 40;
			m.name = "James";
			m.isMarried = true;
			m.child = 3;
			
			System.out.println("나이 :" + m.age);
			System.out.println("이름 :" + m.name);
			System.out.println("결혼 여부 :" + m.isMarried);
			System.out.println("자녀 수 :" + m.child);
			
		}
}
