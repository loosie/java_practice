package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
	/*	
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
//			return;
//			return과 상관없이 finally는 항상 수행됨
		}finally {
			try {
				fis.close(); //null
				System.out.println("finally");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("end");

	*/
		
//	try - with - resources 문
		
		try(FileInputStream fis = new FileInputStream("a.txt")){
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
}
