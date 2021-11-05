package collection.treeset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

	private TreeSet<Member> treeSet;

	public MemberTreeSet() {
		
//		public class Member implements Comparator<Member> �϶�
//		default �����ڸ� ����ߵ�. 
//		treeSet = new TreeSet<Member>(new Member());
		treeSet = new TreeSet<Member>(new Member());
	}

	public void addMember(Member m) {
		treeSet.add(m);
	}

	public boolean removeMember(int memberId) {

		Iterator<Member> ir = treeSet.iterator();

		while (ir.hasNext()) {
			Member m = ir.next();

			if (m.getMemberId() == memberId) {
				treeSet.remove(m);
				return true;
			}
		}

		System.out.println(memberId + "��ȣ�� �������� �ʽ��ϴ�.");
		return false;

	}
	
	public void showAllMember() {
		for(Member m : treeSet) { 
			System.out.println(m);
		}
		
		System.out.println();
	}
}
