package reference;

public class StudnetTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100,"�п�");
		studentLee.setKorSubject("����", 98);
		studentLee.setMaSubject("����", 100);
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(101,"Ŵ��");
		studentKim.setKorSubject("����", 79);
		studentKim.setMaSubject("����", 62);
		
		studentKim.showStudentInfo();
	}

}
