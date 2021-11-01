package chapter4;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		System.out.println("È¦¼ö °ª ÀÔ·Â:");
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		int space = a/2 +1;
		int star =1;
		
		System.out.println(a/2);
 // a= 7 , space =4 star =1 
//		space 4 star 1
//		space 3 star 3
//		space 2 star 5
//		space 1 star 7
		
		for(int i =0; i<a; i++) {
			
				for(int j=0; j<space; j++) {
					System.out.print(' ');
				}
				for(int k=0; k<star; k++) {
					System.out.print("*");
				}
				for(int j=0; j<space; j++) {
					System.out.print(' ');
				}
				
				if(i < a/2) {
					space-=1;
					star+=2;
				}
				else {
					space+=1;
					star-=2;
				}
				System.out.println();		
		}
		
		
	}

}
