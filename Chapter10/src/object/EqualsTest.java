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
//			다운캐스팅
			Student std = (Student)obj;
		
			if(this.studentNum == std.studentNum) {
				return true;
			}
			else return false;
		}
		return false;
	}
}

public class EqualsTest {

	public static void main(String[] args) {
	/*	
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		
//		논리적으로 같음
		System.out.println(str1.equals(str2));
		
		*/
		
		Student Lee = new Student(100,"이종원");
		Student Lee2 = Lee; 
		Student Jong = new Student(100,"이종원");
		
		System.out.println(Lee == Jong);
		
//		equals 오버라이딩으로 재정의
		System.out.println(Lee.equals(Jong));
		
		
//		메모리가 달라도 주민번호나 학번이나 사번이 같으면 같은 취급을 하여 오류 발생방지
//		객체가 같다는 것은 hashCode가 같다는 말과 같다.
		
	}
}
