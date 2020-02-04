package polymorphism;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 걷습니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {

		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
				
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
//			move는 Animal타입이 아닌 각 인스턴스의 move가 호출됨
//			---> 가상 메소드 방법 
		}
	}
	
	
//	하나의 메소드를 통해 여러클래스가 애니멀타입하나로 작동될 수 있음. 	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
}
