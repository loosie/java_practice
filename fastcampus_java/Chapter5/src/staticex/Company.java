package staticex;

public class Company {

//	�ϳ��� �����ϴ� �ν��Ͻ��� �ʿ��� ��  ex)��¥
	
	private static Company instance = new Company();
	
	private Company() {
	}
	
	//�ܺο��� ���� �� �� �ְ� static
	public static Company getInstance() {
		
		if(instance == null) {
			instance = new Company();
		}
		return instance;		
	}
	
}
