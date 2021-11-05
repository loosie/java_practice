package collection.set;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet manager = new MemberHashSet();
		
		Member memberLee = new Member(100,"Lee");
		Member memberLee1 = new Member(200,"Lee1");
		Member memberLee2 = new Member(300,"Lee2");
		Member memberLee3 = new Member(300,"Lee3");
		
		manager.addMember(memberLee);
		manager.addMember(memberLee1);
		manager.addMember(memberLee2);
		manager.addMember(memberLee3);
//		300이 두개가 가능한 이유는 이 두가지가 같다고 정의되지 않았기 때문
//		member클래스에서 정의해 줘야됨.
		
		
		manager.showAllMember();
		
//		manager.removeMember(100);
//		manager.showAllMember();
		
		
		
//		Set을 쓸때는  관리할 object가(Member) 객체와 같다는 것을 정의해 줘야됨 ->hashCode, equals
//		integer나 String같은 클래스는 의미 정의되어 있기 때문에 안해도 됨
		
	}
}
