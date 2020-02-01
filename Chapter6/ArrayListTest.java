package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> aList = new ArrayList<String>();
		
		aList.add("aaa");
		aList.add("bbb");
		aList.add("ccc");
		
		for(int i=0; i<aList.size(); i++) {
			String str = aList.get(i);
			System.out.println(str);
		}
		
		for(String s : aList) {
			System.out.println(s);
		}
		
	}
}
