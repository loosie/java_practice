package polymorphism;

import java.util.ArrayList;

class Animal {

	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}

	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네발로 걷습니다.");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}

	public void flying() {
		System.out.println("독수리가 날개를  쭉 펴고 멀리 날아갑니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {

		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();

//		Human human = (Human)hAnimal; //다운 캐스팅
//		human.readBooks();

		if (hAnimal instanceof Human) {
			Human human = (Human) hAnimal;
			human.readBooks();
		}

		/*
		 * AnimalTest test = new AnimalTest(); test.moveAnimal(hAnimal);
		 * test.moveAnimal(tAnimal); test.moveAnimal(eAnimal);
		 */
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);

		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList); 
		/*
		 * for(Animal animal : animalList) { animal.move(); // move는 Animal타입이 아닌 각
		 * 인스턴스의 move가 호출됨 // ---> 가상 메소드 방법 }
		 */
	}

	
//	다운캐스팅은 명시적으로 일어난다. 안정적으로 하기 위해서 'instanceof'라는 키워드를 쓴다.
//	상위 클래스에서 오바라이딩으로 해결할 수 있는 경우 polymophism을 사용하는게 더 유연하다.
	public void testDownCasting(ArrayList<Animal> list) {
		for (int i = 0; i < list.size(); i++) {
			Animal animal = list.get(i);

			if (animal instanceof Human) {
				Human h = (Human) animal;
				h.readBooks();
			} else if (animal instanceof Tiger) {
				Tiger t = (Tiger) animal;
				t.hunting();
			} else if( animal instanceof Eagle)  {
				Eagle e = (Eagle) animal;
				e.flying();
			} else
				System.out.println("error");
		}

	}

//	하나의 메소드를 통해 여러클래스가 애니멀타입하나로 작동될 수 있음. 	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}
