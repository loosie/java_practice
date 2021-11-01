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
		 * System.out.println(c.showCustomerInfo() + " 지불 금액은" + c.calcPrice(10000) +
		 * "입니다.");
		 * 
		 * }
		 */

		System.out.println("========할인율과 보너스포인트 계산=======");

		int price = 10000;
		for (Customer c : customerList) {
			int cost = c.calcPrice(price);
			System.out.println(c.getCustomerName() + "의 고객님이" + cost + "원을 지불 하셨습니다.");
			System.out.println(c.getCustomerName() + "님의 현재  보너스 포인트는 " + c.bonusPoint + "점 입니다.");
		}

		System.out.println("========고객정보출력=======");

		for (Customer c : customerList) {

			System.out.println(c.showCustomerInfo());
		}

	}

}
