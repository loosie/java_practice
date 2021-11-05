package chapter7;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();

		Customer c1 = new VIPCustomer(100, "lee", 101213);
		Customer c2 = new GOLDCustomer(101, "luka");
		Customer c3 = new GOLDCustomer(102, "shim");
		Customer c4 = new Customer(103, "kim");
		Customer c5 = new Customer(104, "haic");

		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
		customerList.add(c4);
		customerList.add(c5);
		/*
		 * for (Customer c : customerList) { c.calcPrice(10000);
		 * 
		 * System.out.println(c.showCustomerInfo() + " ���� �ݾ���" + c.calcPrice(10000) +
		 * "�Դϴ�.");
		 * 
		 * }
		 */

		System.out.println("========�������� ���ʽ�����Ʈ ���=======");

		int price = 10000;
		for (Customer c : customerList) {
			int cost = c.calcPrice(price);
			System.out.println(c.getCustomerName() + "�� ������" + cost + "���� ���� �ϼ̽��ϴ�.");
			System.out.println(c.getCustomerName() + "���� ����  ���ʽ� ����Ʈ�� " + c.bonusPoint + "�� �Դϴ�.");
		}

		System.out.println("========���������=======");

		for (Customer c : customerList) {

			System.out.println(c.showCustomerInfo());
		}

	}

}
