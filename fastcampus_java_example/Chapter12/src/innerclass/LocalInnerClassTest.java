package innerclass;


class Outer{

	int outNum = 100;
	static int sNum = 200;
	
	
	
//	getRunnable이 실행된 다음에도 run()은 언제든지 불러낼 수 있음 
//	그래서 로컬변수 num,i는 없어져서 유효하지 않는다. 
//	그래서 num과 i는 상수(final)이 되어버린다.
	Runnable getRunnable(int i) {	
		
		int num = 100;
		
//		지역내부클래스
		class MyRunnable implements Runnable{

			@Override
			public void run() {
				
//				num+=10;
//				i = 200;
//				참조는 할수 있지만 변경은 할 수 없다
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
