package stream.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		
		
//		FileReader -> �ѱ� �ȱ���
//		������������ FileReader
//		FileReader fis = new FileReader("reader.txt");
		
		
//		InputStream -> Byte������ ����
//		InputStreamReader�� ���� Byte -> Reader���ڷ� ��ȯ
		FileInputStream fis1 = new FileInputStream("reader.txt");
		InputStreamReader isr = new InputStreamReader(fis1);
		
		
		int i;
		while((i = isr.read()) != -1) {
			System.out.print((char)i);
		}
		
		isr.close();
	}
}
