package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("A");
		ts.add("B");
		ts.add("C");
		
		for(String s : ts) {
			System.out.println(s);
		}
	}
}
