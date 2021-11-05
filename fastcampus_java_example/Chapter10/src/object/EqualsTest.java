package object;

class Student{
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentName = studentName;
		this.studentNum = studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
//			�ٿ�ĳ����
			Student std = (Student)obj;
		
			if(this.studentNum == std.studentNum) {
				return true;
			}
			else return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}
	
	
	
}

public class EqualsTest {

	public static void main(String[] args) {
	/*	
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		
//		�������� ����
		System.out.println(str1.equals(str2));
		
		*/
		
		
		Student Lee = new Student(100,"������");
		Student Lee2 = Lee; 
		Student Jong = new Student(100,"������");
		
		System.out.println(Lee == Jong);
		
//		equals �������̵����� ������
		System.out.println(Lee.equals(Jong));
		
		System.out.println(Lee.hashCode());
		
		
		
		Integer i1 = 100;
		Integer i2 = new Integer(100);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		
		
//		�޸𸮰� �޶� �ֹι�ȣ�� �й��̳� ����� ������ ���� ����� �Ͽ� ���� �߻�����
//		��ü�� ���ٴ� ���� hashCode�� ���ٴ� ���� ����.
		
	}
}
