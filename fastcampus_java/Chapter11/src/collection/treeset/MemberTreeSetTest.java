package collection.treeset;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		MemberTreeSet manager = new MemberTreeSet();
		
		Member memberLee = new Member(300,"Lee");
		Member memberLee1 = new Member(100,"Lee1");
		Member memberLee2 = new Member(200,"Lee2");
		
		manager.addMember(memberLee);
		manager.addMember(memberLee1);
		manager.addMember(memberLee2);

		
		manager.showAllMember();
		
		

		
	}
}
