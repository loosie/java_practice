package classpart;

public class Student {
	// public : 접근 제어
	public int studentID;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
			return studentName;
	}

	
	public static void main(String[] args) {
		
		Student studentPark = new Student();
		studentPark.studentName = "이종원";
		studentPark.showStudentInfo();
	}
}