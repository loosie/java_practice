package array;

public class CharArrayTest {

	public static void main(String[] args) {
		
		char arr[] = new char[26];
		
//		char c = 'A';
//		System.out.println((int)c); 
//		 A ->65
		
		int a =65;
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = (char)a++;
//			or
//			arr[i] = c++; 
			
			System.out.println(arr[i]);
		}
		
		
	}
}
