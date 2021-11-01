package chapter4;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		char op = '/';
		
		int num1 = 10;
		int num2 = 5;
		
		int result = 0;
		
		if(op == '+') {
			result = num1 + num2;
		}
		else if(op == '-') {
			result = num1 - num2;
		}
		else if(op == '*') {
			result = num1 * num2;
		}
		else if(op == '/') {
			result = num1 / num2;
		}
		
			
		System.out.println( op+"연산자" +num1+ "과 "+num2+"의 연산값은");
		System.out.println(result);
		
		
		switch(op) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
		}
		System.out.println( op+"연산자" +num1+ "과 "+num2+"의 연산값은");
		System.out.println(result);
	}

}
