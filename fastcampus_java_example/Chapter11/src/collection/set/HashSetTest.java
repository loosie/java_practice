package collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
//		�ߺ� ��� x , ���� x
		
		set.add("������");
		set.add("������");
		set.add("������2");
		set.add("������3");
		set.add("������4");
		
		System.out.println(set);
		
		
		ArrayList<String> set1 = new ArrayList<String>();
//		�ߺ� ��� , �������
		
		set1.add("������");
		set1.add("������");
		set1.add("������2");
		set1.add("������3");
		set1.add("������4");
		
		System.out.println(set1);
		
		
//		HashSet��  �ټ��� �ϳ��� ���ư��鼭 ����ʹ�
		Iterator<String> ir = set.iterator();

//		hashNext = ���� ������Ʈ�� �մ���?
		while(ir.hasNext()) {
			String s = ir.next();
			System.out.println(s);
		}
		
		
		

		
	}
}
