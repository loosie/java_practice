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
		
//		sleep,join,wait���¿��� interrupt�� ȣ���ϰ� �Ǹ� ���ܰ� �߻��ϸ鼭 �ٽ� runnable���·� ���ư�.
		test.interrupt();
		
		System.out.println("end");
	}
}
