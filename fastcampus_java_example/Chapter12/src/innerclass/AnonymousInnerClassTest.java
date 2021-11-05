package innerclass;

class Outer2{

	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnable(int i) {	
		
		int num = 100;
		
		return new Runnable() {
			@Override
			public void run() {
				
				System.out.println(num + "," + i);
				
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}
		};
	}
	
	
//	�ϳ��� �������̽��� �߻�Ŭ������ ���ؼ� �ٷ� �����ؼ� ��밡��  
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("test");
		}
	};
}

// �͸���Ŭ����
public class AnonymousInnerClassTest {

	public static void main(String[] args) {

		Outer2 out = new Outer2();
		Runnable run = out.getRunnable(20);

		run.run();

		
		
		out.runner.run();
	}
}
