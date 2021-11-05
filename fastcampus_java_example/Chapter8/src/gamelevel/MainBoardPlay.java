package gamelevel;

public class MainBoardPlay {

	public static void main(String[] args) {
		
		Player p1 = new Player();
		p1.play(1);
		
		AdvancedLevel p2 = new AdvancedLevel();
		
		p1.upgradeLevel(p2);
		p1.play(2);
		
		SuperLevel p3 = new SuperLevel();
		
		p1.upgradeLevel(p3);
		p1.play(3);
		
		UltraSuperLevel p4 = new UltraSuperLevel();
		
		p1.upgradeLevel(p4);
		p1.play(4);
	}
}
