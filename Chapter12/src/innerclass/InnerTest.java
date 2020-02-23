package innerclass;

import innerclass.OutClass.InClass;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	
	class InClass{
		int iNum = 100;
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
	}
	
	public void usingInner() {
		inClass.inTest();
	}
	
//	static 클래스 안에는 static 변수,클래스 생성가능 ( static클래스가 아니면 불가능)
	static class InStaticClass{
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum);
		}
		
		static void sTest() {
//			System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum);
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.usingInner();
		
		OutClass.InClass myInClass = outClass.new InClass();
		myInClass.inTest();
		
		System.out.println();
		
//		스태틱클래스 호출
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
//		inTest는 스태틱 메서드가 아니기 때문에 내부에서 스태틱클래스를 생성하고나서 호출해야 한다.
		
		OutClass.InStaticClass.sTest();
		
		
	}
}
