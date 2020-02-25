package stream.coffee;

public class CofffeTest {

	public static void main(String[] args) {
		
		Coffee kenyaamericano = new KenyaAmericano();
		kenyaamericano.brewing();
		
		System.out.println();
		
		Coffee latte = new Latte(new KenyaAmericano());
		latte.brewing();
		
		System.out.println();
		
		Coffee mochacoffee = new Mocha(new Latte(new KenyaAmericano()));
		mochacoffee.brewing();
		
		System.out.println();
		
		Coffee whippingmochacoffee = new WhippingCream(mochacoffee);
		whippingmochacoffee.brewing();
	}
}
