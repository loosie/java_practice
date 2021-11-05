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
//			return�� ������� finally�� �׻� �����
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
		
//	try - with - resources ��
		
		try(FileInputStream fis = new FileInputStream("a.txt")){
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
}
