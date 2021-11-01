package gamelevel;

public class Player {

/*
	BeginnerLevel b;
	AdvancedLevel a;
	SuperLevel s;
 -> �̷��� �ϸ� ��ü���� ���α׷��� �ƴ�.
 ������ ���ε��� �ҷ�����
 go()�� ���� ��� �θ��� �𸣱� ������ ȥ��
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
