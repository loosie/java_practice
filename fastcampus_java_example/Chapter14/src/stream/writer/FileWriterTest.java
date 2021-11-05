package stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("writer.txt");
		
		fw.write('a');
		
		char[] buf = {'B', 'C', 'D', 'E', 'F'};
		fw.write(buf);

		fw.write("æ»≥Á«œººø‰");
		
		fw.write(buf,2,2);
		fw.close();
		
		
		System.out.println("end");
		
		
	}
}
