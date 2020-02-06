package gamelevel;

public class UltraSuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("매우매우 빠르게 달린다.");
		
	}

	@Override
	public void jump() {
		System.out.println("점점점프!");
	}

	@Override
	public void turn() {
		System.out.println("화려하게 회전!");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("******초상급자 레벨입니다.******");

		
	}

}
