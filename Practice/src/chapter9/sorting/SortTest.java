package chapter9.sorting;

import java.io.IOException;


public class SortTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("정렬방식을 선택하세요.");

		System.out.println("B : BubbleSort");
		System.out.println("H : HeapSort");
		System.out.println("Q : QuickSort");
		
		int ch =  System.in.read();
		
		Sort s = null;
		
		if(ch == 'B' || ch =='b') {
			s = new BubbleSort();
			
		}
		else if(ch == 'H' || ch =='h') {
			s = new HeapSort();
		}
		else if(ch == 'Q' || ch =='q') {
			s = new QuickSort();
		}
		else {
			System.out.println("지원되지 않은 기능입니다.");
			return;
		}
		
		int[] arr = new int[10];
		s.ascending(arr);
		s.descending(arr);
		s.description();

	}
}
