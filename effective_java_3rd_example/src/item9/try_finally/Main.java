package item9.try_finally;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {
	private static final String PATH = "src/item9/try_finally";
	private static final int BUFFER_SIZE = 5;
	public static void main(String[] args) throws IOException {
		String data = firstLineOfFile(PATH + "/abc.txt");
		System.out.println(data);

		copy(PATH + "/abc.txt", PATH + "/copy.txt");
	}

	static String firstLineOfFile(String path) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(path));
		try{
			return br.readLine();
		} catch (Exception e){
			return e.getMessage();
		} finally{
			br.close();
		}
	}

	static void copy(String src, String dst) throws IOException{
		InputStream in = new FileInputStream(src);
		try{
			OutputStream out = new FileOutputStream(dst);
			try{
				byte[] buf = new byte[BUFFER_SIZE];
				int n ;
				while((n=in.read(buf)) >= 0){
					out.write(buf, 0, n);
				}
			} finally {
				out.close();
			}
		} finally {
			in.close();
		}
	}
}
