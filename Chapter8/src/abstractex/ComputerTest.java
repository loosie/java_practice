package abstractex;

public class ComputerTest {

	public static void main(String[] args) {

		Computer c = new DeskTop();

		c.display();
		c.turnOff();

		Computer c1 = new MyNoteBook();
//		= NoteBook c1 = new MyNoteBook();

/*		추상 클래스는 주로 상속의 상위클래스로 사용됨
		추상 메소드 : 하위 클래스가 구현해야 하는 메소드
		구현된 메소드 : 하위 클래스가 공통으로 사용하는 기능의 메소드
				    하위 클래스에 따라 재정의 할 수 있음 
		*/
	}
}
