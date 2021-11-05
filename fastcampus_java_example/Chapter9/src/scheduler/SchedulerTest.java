package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("��ȭ ���� �Ҵ� ����� �����ϼ���.");
		System.out.println("R : �Ѹ� ���ʴ��");
		System.out.println("L : ��Ⱑ ���� ���� �켱");
		System.out.println("P : �켱������ ���� ���켱 ���õ� ���� ����");
		
		int ch = System.in.read();
		
		Scheduler sc = null;
		
		if(ch == 'R' || ch =='r') {
			sc = new RoundRobin();
		}
		else if(ch == 'L' || ch =='l') {
			sc = new LeastJob();
		}
		else if(ch == 'P' || ch =='p') {
			sc = new PriorityAllocation();
		}
		else {
			System.out.println("�������� ���� ����Դϴ�.");
			return;
		}
		
		sc.getNextCall();
		sc.sendCallToAgent();
	}
	
}
