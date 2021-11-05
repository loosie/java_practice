package collection.hashmap;

import java.util.Comparator;

public class Member implements Comparator<Member> {

	private int memberId;
	private String memberName;
	
	public Member() {}
	public Member(int memeberID, String memberName) {
		this.memberId = memeberID;
		this.memberName = memberName;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName + "ȸ������ ���̵��" + memberId + "�Դϴ�.";
	}
	
//	�ߺ�����
	@Override
	public int hashCode() {
		return memberId;
	}
	
	
	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Member) {
			Member m = (Member)obj;
			
			return (this.memberId == m.memberId);
		} 
		
		return false;
	}
	
/*
	
//	implements Comparator<Member>
//	this�ϰ� �Ѿ�� �Ű����� ��
	@Override
	public int compareTo(Member member) {
		return (this.memberId - member.memberId); //��������
//		�������� ��������
//		�̸����� �����ϰ������ String
//		return this.memberName.compareTo(member.getMemberName());  
	}
	
*/
	
//	implements Comparable<Member>	
//  o1 -> this , o2 -> �Ѿ�� �Ű�����	
	@Override
	public int compare(Member o1, Member o2) {

		return (o1.memberId - o2.memberId);
	}

	

	
	
}
