package stream;

import java.util.Arrays;

public class IntArrayTest {

//	스트림 연산
//	forEach() : 요소를 하나씩 꺼내 옴
//	count() : 요소의 개수
//	sum() : 요소의 합
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		int sum = Arrays.stream(arr).sum();
		int count = (int)Arrays.stream(arr).count();
		
		System.out.println(sum);
		System.out.println(count);
		
		System.out.println(Arrays.stream(arr).reduce(0, (a,b)->a+b));
	}
}
