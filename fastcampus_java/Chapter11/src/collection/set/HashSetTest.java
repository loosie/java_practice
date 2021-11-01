package collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
//		중복 허용 x , 순서 x
		
		set.add("이종원");
		set.add("이종원");
		set.add("이종원2");
		set.add("이종원3");
		set.add("이종원4");
		
		System.out.println(set);
		
		
		ArrayList<String> set1 = new ArrayList<String>();
//		중복 허용 , 순서대로
		
		set1.add("이종원");
		set1.add("이종원");
		set1.add("이종원2");
		set1.add("이종원3");
		set1.add("이종원4");
		
		System.out.println(set1);
		
		
//		HashSet을  다수로 하나씩 돌아가면서 쓰고싶다
		Iterator<String> ir = set.iterator();

//		hashNext = 다음 엘리먼트가 잇느냐?
		while(ir.hasNext()) {
			String s = ir.next();
			System.out.println(s);
		}
		
		
		

		
	}
}
