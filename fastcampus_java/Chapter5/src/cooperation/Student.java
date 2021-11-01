package cooperation;

public class Student {

		String studentName;
		int grade;
		int money;
		
		public Student(String sName,int money) {
			this.studentName = sName;
			this.money = money;
		}
		
//		°´Ã¼°£ÀÇ Çù¾÷
		public void takeBus(Bus bus) {
			bus.take(1000);
			this.money -= 1000;
		}
		
		public void takeSubway(Subway sub) {
			sub.take(1200);
			this.money -= 1200;
		}
		
		public void takeTaxi(Taxi taxi) {
			taxi.take(10000);
			this.money -=10000;
		}
		public void showInfo() {
			System.out.println(studentName + "´ÔÀÇ ³²Àº µ·Àº " + money + "¿ø ÀÔ´Ï´Ù.");
		}
} 
