package coffee;

public class Person {

	String name;
	int money;
	
	public Person(String name,int money) {
		this.name = name;
		this.money = money;
	}
	
	
	public void buyStarCoffee(StarCoffee sCoffee,int money) {
		String message = sCoffee.brewing(4000);
		if(message != null) {
			this.money -= money;
			System.out.println(name + "의 고객이" + money + "원을 주고" + message);
		}
	}
	public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
		String message = bCoffee.brewing(4500);
		if(message != null) {
			this.money -= money;
			System.out.println(name + "의 고객이" + money +"원을 주고"  + message);
		}
	}
}
