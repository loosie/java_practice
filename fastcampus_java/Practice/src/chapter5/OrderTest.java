package chapter5;

public class OrderTest {

	public static void main(String[] args) {

		Order o = new Order();
		o.no = 201907210001L;
		o.id = "abc123";
		o.date = "2019�� 7�� 21��";
		o.name = "ȫ���";
		o.orno = "PD0345-12";
		o.address = "���N�� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ: " + o.no);
		System.out.println("�ֹ��� �ƾƵ�: " + o.id);
		System.out.println("�ֹ� ��¥: " + o.date);
		System.out.println("�ֹ��� �̸�: " + o.name);
		System.out.println("�ֹ� ��ǰ ��ȣ: " + o.orno);
		System.out.println("��� �ּ�: " + o.address);
	}

}
