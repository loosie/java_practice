package cooperation;

public class TakeTransTest {

	public static void main(String[] args) {

		Student studentJ = new Student("James",5000);
		Student studentK = new Student("Kale",12000);
		Student studentL = new Student("Lim",15000);
		
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		Subway subwayGreen = new Subway(2);
		Subway subwayBlue = new Subway(4);
		
		Taxi taxi100 = new Taxi(100);
		
		studentJ.takeBus(bus100);
		studentK.takeSubway(subwayGreen);
		studentL.takeTaxi(taxi100);
		
		
		studentJ.showInfo();
		studentK.showInfo();
		studentL.showInfo();
		
		bus100.showBusInfo();
		bus500.showBusInfo();
		
		
		subwayGreen.showSubWayInfo();
		taxi100.showTaxiInfo();
	}
}
