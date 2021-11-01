package object;

class Book implements Cloneable{
	String title;
	String author;
	
	public Book(String title,String author) {
		this.title = title;
		this.author = author;
	}
	
	
//	toString ������
	@Override
	public String toString() {
		return author + "," + title;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


//	��ü�� ���޸𸮿��� �����ɶ� �������÷��Ϳ��� ����Ǵ� �޼ҵ�
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
		
		
		Book b2 =(Book)b.clone(); //����
		System.out.println(b2);
	}
}
