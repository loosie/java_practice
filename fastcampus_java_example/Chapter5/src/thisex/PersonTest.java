package thisex;

public class PersonTest {

	public static void main(String[] args) {
		
		Person pName = new Person();
		pName.showInfo();
		
		
		Person pName2 = new Person("Lee",22);
		pName2.showInfo();
		System.out.println(pName2);
		
		Person p = pName2.getSelf();
		System.out.println(p);
		
	}
}
