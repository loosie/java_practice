package lambda;


// 함수형 인터페이스
@FunctionalInterface
public interface MyMaxNumber {

	int getMaxNumber(int x, int y);
	
//	void add(int x, int y);
//	함수형 인터페이스는 메서드 1개만 생성가능
}
