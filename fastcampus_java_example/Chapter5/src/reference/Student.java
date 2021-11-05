package reference;

public class Student {

		int studentID;
		String studentName;
		
		Subject	korea;  //���� �ڷ��� ���� ����
		Subject math;
		
		
		public Student(int id, String name) {
			studentID = id;
			studentName = name;
			
			korea = new Subject();  //�� ������ �����ڿ��� �ʱ�ȭ
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
			System.out.println("�л� ��ȣ : "+ studentID);
			System.out.println("�л� �̸� : "+ studentName);
			System.out.println("���� �̸� : "+ korea.subjectName +"/ ���� : "+ korea.score);
			System.out.println("���� �̸� : "+ math.subjectName +"/ ���� : "+ math.score);
		}
}
