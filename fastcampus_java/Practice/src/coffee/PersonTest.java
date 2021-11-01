package coffee;

public class PersonTest {

	public static void main(String[] args) {
		
		StarCoffee sCoffee = new StarCoffee();
		BeanCoffee bCoffee = new BeanCoffee();
		
		Person p1 = new Person("kim",10000);
		Person p2 = new Person("lee",13000);
		
		p1.buyStarCoffee(sCoffee, Menu.STARAMERICANO);
		p2.buyBeanCoffee(bCoffee, Menu.BEANLATTE);
		
				
	}
}
