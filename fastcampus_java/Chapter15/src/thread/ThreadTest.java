package thread;

class MyThread implements Runnable{


	public void run() {
		int i;
		
		for(i=0; i<=200; i++) {
			System.out.print(i+ "\t");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}


public class ThreadTest {

//	스레드 총 3개
//	메인스레드 1 (start 찍고, 스레드2개만들어서 띄어놓고 end찍고 종료) ->제일먼저 종료됨
	public static void main(String[] args) {
		
		System.out.println("start");
//		th1,th2 스레드 2개
/*		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.start();
		th2.start(); 
*/		

/*		MyThread runner1 = new MyThread();
		Thread th1 = new Thread(runner1);
		
		th1.start();
		
		MyThread runner2 = new MyThread();
		Thread th2 = new Thread(runner2);
		
		th2.start();
		
*/		
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		System.out.println("end");
	}
}
