package classpart;

public class Student {
	// public : 立辟 力绢
	public int studentID;
	public String studentName;
	public String address;
	
	public Student(String name) {
		studentName = name;
	}
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "林家 绝澜";
	}
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
			return studentName;
	}

	

}