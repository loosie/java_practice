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
//		300�� �ΰ��� ������ ������ �� �ΰ����� ���ٰ� ���ǵ��� �ʾұ� ����
//		memberŬ�������� ������ ��ߵ�.
		
		
		manager.showAllMember();
		
//		manager.removeMember(100);
//		manager.showAllMember();
		
		
		
//		Set�� ������  ������ object��(Member) ��ü�� ���ٴ� ���� ������ ��ߵ� ->hashCode, equals
//		integer�� String���� Ŭ������ �ǹ� ���ǵǾ� �ֱ� ������ ���ص� ��
		
	}
}
