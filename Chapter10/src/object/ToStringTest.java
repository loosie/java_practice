package object;

class Book{
	String title;
	String author;
	
	public Book(String title,String author) {
		this.title = title;
		this.author = author;
	}
	
	
//	toString ¿Á¡§¿«
	@Override
	public String toString() {
		return author + "," + title;
	}
}

public class ToStringTest {

	public static void main(String[] args) {
		
		Book b = new Book("Save","Lil peep");
		
		System.out.println(b);
		
//		String str = new String("Save");
//		System.out.println(str.toString());
	}
}
