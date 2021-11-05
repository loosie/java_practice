package chapter6;

public class StudentTest {

	public static void main(String[] args) {
		
		Student lee = new Student(1001,"Lee");
		Student kim = new Student(1002,"Kim");
		Student cho = new Student(1003,"Cho");
		
		
		
		lee.addBook("태백산맥1", "조정래");
		lee.addBook("태백산맥2", "조정래");
		
		kim.addBook("토지1", "김김");
		kim.addBook("토지2", "김김");
		kim.addBook("토지3", "김김");
		
		cho.addBook("해리포터1", "롤링");
		cho.addBook("해리포터2", "롤링");
		cho.addBook("해리포터3", "롤링");
		cho.addBook("해리포터4", "롤링");
		cho.addBook("해리포터5", "롤링");
		cho.addBook("해리포터6", "롤링");
		
		
		
		lee.showBookListInfo();
		kim.showBookListInfo();
		cho.showBookListInfo();
	}
}
