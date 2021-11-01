package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

	private HashSet<Member> hashSet;

	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}

	public void addMember(Member m) {
		hashSet.add(m);
	}

	public boolean removeMember(int memberId) {

		Iterator<Member> ir = hashSet.iterator();

		while (ir.hasNext()) {
			Member m = ir.next();

			if (m.getMemberId() == memberId) {
				hashSet.remove(m);
				return true;
			}
		}

		System.out.println(memberId + "번호가 존재하지 않습니다.");
		return false;

	}
	
	public void showAllMember() {
		for(Member m : hashSet) { 
			System.out.println(m);
		}
		
		System.out.println();
	}
}
