package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		
		StringConImp1 imp1 = new StringConImp1();
		imp1.makeString("hello", "world");
		
		
//		이것만 있으면 클래스 구현 필요없음 1
		StringConcat concat = (s,v)->System.out.println(s+","+v);
		concat.makeString("hello", "world!");
		
		
		
//		객체 지향인데 어떻게 이렇게 람다식으로 돌아가느냐
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+","+s2);				
			}
		};
		
		concat2.makeString("hello", "world!!");
	}
//	1에서는 이게 생략된거임.
}
