package loopexample;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		
		/*	int num =1;
			int sum =0;
			
			while(num<=10) {
				sum += num;
				num++;
			}
			System.out.println(sum);
		*/
		
		Scanner s = new Scanner(System.in);	
		int input=s.nextInt();
		int sum=0;
		
		while(input !=0) {
			sum +=input;
			input = s.nextInt();
			
		}
			
		System.out.println(sum);
	
	}

}
