package chapter8;

public abstract class Car {

	public abstract void startCar();
	public abstract void drive(); 
	public abstract void stop();
	public abstract void turnOff();
	
	
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
