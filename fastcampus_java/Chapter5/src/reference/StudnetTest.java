package reference;

public class StudnetTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100,"쫑원");
		studentLee.setKorSubject("국어", 98);
		studentLee.setMaSubject("수학", 100);
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(101,"킴리");
		studentKim.setKorSubject("국어", 79);
		studentKim.setMaSubject("수학", 62);
		
		studentKim.showStudentInfo();
	}

}
