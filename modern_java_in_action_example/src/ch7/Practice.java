package ch7;

import org.junit.jupiter.api.Test;

import ch7.forkjoin.ForkJoinSumCalculator;

public class Practice {

	@Test
	void test(){
		long start = System.currentTimeMillis();
		ForkJoinSumCalculator.forkJoinSum(100_000_000L);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
