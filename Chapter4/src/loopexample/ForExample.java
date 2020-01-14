package loopexample;

public class ForExample {

	public static void main(String[] args) {

		int count;
		int sum = 0;

		for (count = 0; count < 10; count++) { // 횟수 10번
			sum += count;
		}

		System.out.println(sum);

		int num = 1;
		int total = 0;

		while (num <= 10) {
			total += num;
			num++;
		}
		System.out.println(total);

		for (;;) {
			// 무한루프
			// while(true)와 같음
		}
	}

}
