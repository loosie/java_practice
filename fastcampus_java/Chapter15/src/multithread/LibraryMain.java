package multithread;

import java.util.ArrayList;

class FastLibrary{
	
	public ArrayList<String> books = new ArrayList<String>();
	
	public FastLibrary(){
		books.add("해빗");
		books.add("넛지");
		books.add("아주 작은 습관의 힘");
//		books.add("순수이성비판");
//		books.add("플로스 강변의 물방앗간");
//		books.add("시크릿 ");
	}
	
	public synchronized String lendBook() throws InterruptedException {
		
		Thread t = Thread.currentThread();
		
		while(books.size() == 0) {
			System.out.println(t.getName()+ " waiting start");
			wait();
			System.out.println(t.getName()+ " waiting end");
		}
		String title = books.remove(0);
		System.out.println(t.getName() + ": " + title + " lend");
		
		return title;
		
	}
	
	public synchronized void returnBook(String title) {

		Thread t = Thread.currentThread();
		books.add(title);
		notifyAll();
		
		System.out.println(t.getName() + ": " + title + " return");
		
	}
}

class Student extends Thread{
	
	public void run() {
	
		try {
			String title = LibraryMain.library.lendBook();
			if(title == null) return;
			
			sleep(5000);
			LibraryMain.library.returnBook(title);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


public class LibraryMain {

	public static FastLibrary library = new FastLibrary();

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		Student s6 = new Student();
		
		
		s1.start();
		s2.start();
		s3.start();

		s4.start();
		s5.start();
		s6.start();
	}
	
}
