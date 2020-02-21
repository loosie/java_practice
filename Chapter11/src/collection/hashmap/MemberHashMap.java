package collection.hashmap;

import java.util.HashMap;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		
		hashMap = new HashMap<Integer, Member>();
	}
	
	
	public void addMember(Member m) {
		hashMap.put(m.getMemberId(),m);
	}
}
