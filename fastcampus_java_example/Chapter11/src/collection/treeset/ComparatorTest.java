package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;


// ������������ �ϰ������
// 1
class MyCompare implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
			
		return (o1.compareTo(o2)*(-1));
	}
	
	
}


public class ComparatorTest {

	public static void main(String[] args) {

//		��������2 ->default ������ �־��ֱ�
		TreeSet<String> ts = new TreeSet<String>(new MyCompare());
		ts.add("A");
		ts.add("B");
		ts.add("C");

		for (String s : ts) {
			System.out.println(s);
		}

	}
}
