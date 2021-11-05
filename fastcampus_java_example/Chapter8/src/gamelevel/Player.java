package gamelevel;

public class Player {

/*
	BeginnerLevel b;
	AdvancedLevel a;
	SuperLevel s;
 -> 이렇게 하면 객체지향 프로그램이 아님.
 레벨을 따로따로 불러내면
 go()를 언제 어떻게 부를지 모르기 떄문에 혼잡
	*/
	
	private PlayerLevel level;

	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}

	public void upgradeLevel( PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
		
	}
}
