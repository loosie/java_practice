package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {		
	}
	
//	템플릿메서드	 
//	final -> 재정의 될 수 없는 메소드  ex.메모리,시나리오정의
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
