package staticex;

public class StudentIdTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("lee");
		System.out.println(Student.getSerialNum());
		
		Student s2 = new Student("kim");
		
		System.out.println(Student.getSerialNum());
		System.out.println(Student.getSerialNum());
		//static s1,s2 모두 같은  메모리 
		
		System.out.println(s1.getStudentID());
		System.out.println(s2.getStudentID());
		
		
	}
}
