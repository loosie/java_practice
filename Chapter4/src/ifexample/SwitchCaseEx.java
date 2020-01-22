package ifexample;

import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int rank = s.nextInt();
		char medalColor;

		switch (rank) {
			case 1:
				medalColor = 'G';
				break;
			case 2:
				medalColor = 'S';
				break;
			case 3:
				medalColor = 'B';
				break;
			default:
				medalColor = 'A';
		}

		System.out.println(rank + "µî " + medalColor + "¸Þ´Þ");
	}

}
