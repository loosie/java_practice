package chapter6;

public class StudentTest {

	public static void main(String[] args) {
		
		Student lee = new Student(1001,"Lee");
		Student kim = new Student(1002,"Kim");
		Student cho = new Student(1003,"Cho");
		
		
		
		lee.addBook("�¹���1", "������");
		lee.addBook("�¹���2", "������");
		
		kim.addBook("����1", "���");
		kim.addBook("����2", "���");
		kim.addBook("����3", "���");
		
		cho.addBook("�ظ�����1", "�Ѹ�");
		cho.addBook("�ظ�����2", "�Ѹ�");
		cho.addBook("�ظ�����3", "�Ѹ�");
		cho.addBook("�ظ�����4", "�Ѹ�");
		cho.addBook("�ظ�����5", "�Ѹ�");
		cho.addBook("�ظ�����6", "�Ѹ�");
		
		
		
		lee.showBookListInfo();
		kim.showBookListInfo();
		cho.showBookListInfo();
	}
}
