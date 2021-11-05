package array;

public class ObjectCopy {
	
	public static void main(String[] args) {
			
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
 		
		library[0] = new Book("태백" , "조정래");
		library[1] = new Book("태백1" , "조정래");
		library[2] = new Book("태백2" , "조정래");
		library[3] = new Book("태백3" , "조정래");
		library[4] = new Book("태백4 " , "조정래");
		
//		System.arraycopy(library, 0, copyLibrary, 0, 5);
//		arraycopy -> 얕은복사
//		깊은 복사 (각자의 인스턴스를 갖기)를 하기 위해서는 
//		일일이 객체를 만들어서 각각 다 복사해줘야됨
		
//		=============================================
//		얕은복사
/*		
		
		library[0].setTitle("나무");
		library[0].setAuthor("박완서");
		
		for(Book book : library) {
			book.showBookInfo();
		}
		
		
		System.out.println("==============");

		for( Book book : copyLibrary) {
			book.showBookInfo();
		}
	*/		
		
//		=============================================
//		깊은복사
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for(int i=0; i<library.length; i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		library[0].setTitle("나무");
		library[0].setAuthor("박완서");
		
		for(Book book : library) {
			book.showBookInfo();
		}
		
		
		System.out.println("==============");

		for( Book book : copyLibrary) {
			book.showBookInfo();
		}
		
	}
}
