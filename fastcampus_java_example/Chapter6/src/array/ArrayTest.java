package array;

public class ArrayTest {

		public static void main(String[] args) {
			int arr[] = new int[] {1,2,3};
			
			int arr1[] = {2,3,4};
//			선언과 동시에 초기화.
			
			int[] arr2 = new int[10];
			
			int total = 0;
			
			for(int i=0; i<arr2.length; i++) {
				
				arr2[i] = i+1;
				total += arr2[i];
				System.out.println(arr2[i]);
				
			}
			System.out.println(total);
			
			
			double dArr[] = new double[5];
			
			dArr[0] = 1.1;
			dArr[1] = 2.1;
			dArr[2] = 3.1;
			
			double mtotal = 1;
			for(int i=0; i<dArr.length-2; i++) {
				mtotal *= dArr[i];
			}
			System.out.println(mtotal);
		}
}
