package polymorphism;

import java.util.ArrayList;

class Animal {

	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}

	public void readBooks() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �Ƚ��ϴ�.");
	}

	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ư��ϴ�.");
	}

	public void flying() {
		System.out.println("�������� ������  �� ��� �ָ� ���ư��ϴ�.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {

		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();

//		Human human = (Human)hAnimal; //�ٿ� ĳ����
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
		 * for(Animal animal : animalList) { animal.move(); // move�� AnimalŸ���� �ƴ� ��
		 * �ν��Ͻ��� move�� ȣ��� // ---> ���� �޼ҵ� ��� }
		 */
	}

	
//	�ٿ�ĳ������ ��������� �Ͼ��. ���������� �ϱ� ���ؼ� 'instanceof'��� Ű���带 ����.
//	���� Ŭ�������� ���ٶ��̵����� �ذ��� �� �ִ� ��� polymophism�� ����ϴ°� �� �����ϴ�.
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

//	�ϳ��� �޼ҵ带 ���� ����Ŭ������ �ִϸ�Ÿ���ϳ��� �۵��� �� ����. 	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}
