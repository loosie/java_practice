package loopexample;

public class BreakContinueExample {

	public static void main(String[] args) {

//		break,continue ���� 
//		������ ���
//		¦�� �ܸ� ���, �ܺ��� ���ϴ� ���� �۰ų� ���� �������� ���
		
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
