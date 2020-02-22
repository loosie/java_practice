package collection.treemap;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		
		MemberTreeMap manager = new MemberTreeMap();
		
		Member memberLee = new Member(100,"Lee");
		Member memberLee2 = new Member(300,"Lee2");
		Member memberLee1 = new Member(200,"Lee1");
		Member memberLee3 = new Member(400,"Lee3");
		
		manager.addMember(memberLee);
		manager.addMember(memberLee2);
		manager.addMember(memberLee1);
		manager.addMember(memberLee3);


		manager.showAllMember();

		manager.removeMember(200);
		manager.showAllMember();
	
	}
}
