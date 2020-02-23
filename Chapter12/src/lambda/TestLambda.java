package lambda;

interface PrintString{
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("Test");
		
		ShowMyString(lambdaStr);
		
		PrintString test = returnString();
		test.showString("Test3");
	}
	
//	2	
	public static void ShowMyString(PrintString p) {
		p.showString("Test2");
	}
	
//	3
	public static PrintString returnString() {

		return s-> System.out.println(s + "!!!!");
	}
}
