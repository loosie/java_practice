package reference;

public class Student {

		int studentID;
		String studentName;
		
		Subject	korea;  //참조 자료형 변수 선언
		Subject math;
		
		
		public Student(int id, String name) {
			studentID = id;
			studentName = name;
			
			korea = new Subject();  //이 변수를 생성자에서 초기화
			math = new Subject();
			
		}
		
		public void setKorSubject(String name,int score) {

			korea.subjectName = name;
			korea.score = score;
		}
		
		public void setMaSubject(String name,int score) {

			math.subjectName = name;
			math.score = score;
		}
		
		public void showStudentInfo() {
			System.out.println("학생 번호 : "+ studentID);
			System.out.println("학생 이름 : "+ studentName);
			System.out.println("과목 이름 : "+ korea.subjectName +"/ 성적 : "+ korea.score);
			System.out.println("과목 이름 : "+ math.subjectName +"/ 성적 : "+ math.score);
		}
}
