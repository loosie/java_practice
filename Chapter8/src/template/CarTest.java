package template;

public class CarTest {

	public static void main(String[] args) {
		
		Car aiCar = new AICar();
		aiCar.run();
		System.out.println("天天天天天天天天天天天天天天天天天天");
		Car mCar = new ManualCar();
		mCar.run();
	}
}
