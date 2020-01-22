package loopexample;

public class BreakContinueExample {

	public static void main(String[] args) {

//		break,continue 문제 
//		구구단 출력
//		짝수 단만 출력, 단보다 곱하는 수가 작거나 같을 때까지만 출력
		
		int dan;
		
		int num;
		for(dan=2; dan<10; dan++) {
				
			if((dan%2) !=0) continue;
			
			for(num=1; num<10; num++) {
					
				if(dan < num) break;
				System.out.println(dan + "x" + num +" = " + dan*num);	
				
			}
			System.out.println();
		}
	}
}
