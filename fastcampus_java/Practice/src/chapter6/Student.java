package chapter6;

import java.util.ArrayList;

public class Student {

	private int studentID;
	private String studentName;
	ArrayList<Book> bookList;
	
	
	public Student() {}
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		bookList = new ArrayList<Book>();
		}
	
	public void addBook(String bookname, String author) {
		Book b = new Book(bookname,author);
		
		b.setAuthor(author);
		b.setBookName(bookname);

		bookList.add(b);
	}
	
	public void showBookListInfo() {
		
		System.out.print(studentName + "학생이 읽은 책은 :");
		for(Book b : bookList) {
			System.out.print(b.getBookName()+ " ");
		}
		System.out.println("입니다.");
	}
}
