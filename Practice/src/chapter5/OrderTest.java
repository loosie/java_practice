package chapter5;

public class OrderTest {

	public static void main(String[] args) {

		Order o = new Order();
		o.no = 201907210001L;
		o.id = "abc123";
		o.date = "2019년 7월 21일";
		o.name = "홍길순";
		o.orno = "PD0345-12";
		o.address = "서욼시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호: " + o.no);
		System.out.println("주문자 아아디: " + o.id);
		System.out.println("주문 날짜: " + o.date);
		System.out.println("주문자 이름: " + o.name);
		System.out.println("주문 상품 번호: " + o.orno);
		System.out.println("배송 주소: " + o.address);
	}

}
