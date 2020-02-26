package thread;

public class InterruptTest extends Thread {

	public void run() {
		int i;
		
		for(i =0; i<100; i++) {
			System.out.println(i);
		}
		
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e);
			System.out.println("Wake!!");
		}
	}
	
	public static void main(String[] args) {
		
		InterruptTest test = new InterruptTest();
		test.start();
		
//		sleep,join,wait상태에서 interrupt를 호출하게 되면 예외가 발생하면서 다시 runnable상태로 돌아감.
		test.interrupt();
		
		System.out.println("end");
	}
}
