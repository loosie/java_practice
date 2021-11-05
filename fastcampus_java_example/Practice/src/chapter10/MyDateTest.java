package chapter10;


class Date{
	
	
	int day;
	int month;
	int year;
	
	Date(int year,int month,int day){
		
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return year+month+day;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Date) {
			
			Date d = (Date) obj;
			
			if(this.year == d.year && this.month == d.month && this.day == d.day ) { 
				return true;
			}else return false;
		}
		return false;
	}
	
	
	
}

public class MyDateTest {

	public static void main(String[] args) {
		Date d1 = new Date(2020,10,11);
		Date d2 = new Date(2020,10,11);
		
		System.out.println(d1.equals(d2));
		
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		
	}
}
