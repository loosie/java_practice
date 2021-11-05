package array;

import java.util.ArrayList;

public class Student {

	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	
	public Student(int studentID, String studentName) {
		
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject s = new Subject(name,score);
		
		subjectList.add(s);
	}
	
	public void showStudentInfo() {
		
		int total = 0;
		
		for(Subject s : subjectList) {
			
			total += s.getScore();
			System.out.println( studentName + "�л���" + s.getName() + "������ ������" + s.getScore()+"�Դϴ�.");
		}
		
		System.out.println( studentName + "�л��� ������" + total + "�� �Դϴ�." );
	}
}
