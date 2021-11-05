package staticex;

public class Company {

//	하나만 존재하는 인스턴스가 필요할 때  ex)날짜
	
	private static Company instance = new Company();
	
	private Company() {
	}
	
	//외부에서 가져 갈 수 있게 static
	public static Company getInstance() {
		
		if(instance == null) {
			instance = new Company();
		}
		return instance;		
	}
	
}
