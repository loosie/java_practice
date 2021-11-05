package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;


class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length)
			return s1;
		else return s2;
	}
	
}


public class ReduceTest {

	
	public static void main(String[] args) {
		
		String[] greetings = {"안녕하세요~~", "hello", "Bon jour","이거 참 반갑구머이 동무"};
		
//		제일 긴 문장 반환하는 reduce
		
		String a =Arrays.stream(greetings).reduce("", (s1,s2)->{
			if(s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else return s2;
		});
		
		System.out.println(a);
		
		
// 	 식이 너무 길고 복잡하면 직접 클래스 구현
		
		String b =Arrays.stream(greetings).reduce(new CompareString()).get();
		
		System.out.println(b);
		
	
	}
}
