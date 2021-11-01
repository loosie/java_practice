package thread;

import java.io.IOException;

public class TerminateThread extends Thread {

	private boolean flag = false;
	
	int i;
	
	public TerminateThread(String name) {
		super(name);
	}
	
	public void run() {
		while(!flag) {
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(getName() + " end");
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public static void main(String[] args) throws IOException {
		
		TerminateThread ttA = new TerminateThread("A");
		TerminateThread ttB = new TerminateThread("B");
		
		ttA.start();
		ttB.start();
		
		int in;
		while(true) {
			in = System.in.read();
			if ( in == 'A') {
				ttA.setFlag(true);
			}
			else if(in == 'B') {
				ttB.setFlag(true);
			}
			else if(in == 'M') {
				ttA.setFlag(true);
				ttB.setFlag(true);
				break;
			}
			else {
//				엔터를 치면 \n , \r이 여기에 걸려서 2번 나옴
				System.out.println("try again");
			}
		}
		
		System.out.println("main end");
	
	} 
}
