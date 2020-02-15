package object;

class Book implements Cloneable{
	String title;
	String author;
	
	public Book(String title,String author) {
		this.title = title;
		this.author = author;
	}
	
	
//	toString 재정의
	@Override
	public String toString() {
		return author + "," + title;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


//	객체가 힙메모리에서 해제될때 가비지컬렉터에서 수행되는 메소드
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
}

public class ToStringTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Book b = new Book("Save","Lil peep");
		
		System.out.println(b);
		
//		String str = new String("Save");
//		System.out.println(str.toString());
		
		
		Book b2 =(Book)b.clone(); //복제
		System.out.println(b2);
	}
}
