package interfaceex;

public class Customer implements Buy,Sell{

	@Override
	public void sell() {
		System.out.println("customer sell");
	}

	@Override
	public void buy() {
		System.out.println("customer buy");
	}

	@Override
	public void order() {
		System.out.println("customer order");
	//	Buy.super.order();
	}
	public void sayHello() {
		System.out.println("hello");
	}

	
}
