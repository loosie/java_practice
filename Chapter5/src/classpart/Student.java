package classpart;

public class Student {
// public : 접근 제어
	public int studentID;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}

}