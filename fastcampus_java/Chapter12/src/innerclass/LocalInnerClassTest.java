package innerclass;


class Outer{

	int outNum = 100;
	static int sNum = 200;
	
	
	
//	getRunnable�� ����� �������� run()�� �������� �ҷ��� �� ���� 
//	�׷��� ���ú��� num,i�� �������� ��ȿ���� �ʴ´�. 
//	�׷��� num�� i�� ���(final)�� �Ǿ������.
	Runnable getRunnable(int i) {	
		
		int num = 100;
		
//		��������Ŭ����
		class MyRunnable implements Runnable{

			@Override
			public void run() {
				
//				num+=10;
//				i = 200;
//				������ �Ҽ� ������ ������ �� �� ����
				System.out.println(num + "," + i);
				
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}
			
		}
		return new MyRunnable();
	}
}


public class LocalInnerClassTest {

	public static void main(String[] args) {
		
		Outer out = new Outer();
		Runnable run = out.getRunnable(20);
		
		run.run();
		
	}
}
