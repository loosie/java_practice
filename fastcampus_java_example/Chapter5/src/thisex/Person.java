package thisex;

public class Person {

	String name;
	int age;
	
	public Person() {
		this("이름없음",1);
//		this가 first statement이어야 한다.
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;	
	}
	
	public void showInfo() {
		System.out.println(name + "," + age);
	}
	
	public Person getSelf() {
		return this;
	}
	
	
}
