package stream.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		
		
//		FileReader -> 한글 안깨짐
//		문자읽을때는 FileReader
//		FileReader fis = new FileReader("reader.txt");
		
		
//		InputStream -> Byte단위로 읽음
//		InputStreamReader로 인해 Byte -> Reader문자로 변환
		FileInputStream fis1 = new FileInputStream("reader.txt");
		InputStreamReader isr = new InputStreamReader(fis1);
		
		
		int i;
		while((i = isr.read()) != -1) {
			System.out.print((char)i);
		}
		
		isr.close();
	}
}
