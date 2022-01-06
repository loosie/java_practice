package calculator;

import java.util.stream.Stream;

public class StringCalculator {
	private final String BASIC_REGEX = ",|:";
	int add(String text){
		String[] numbers = text.split(BASIC_REGEX);

		return Stream.of(numbers)
			.mapToInt(i -> Integer.parseInt(i)).sum();
	}
}
