package calculator;

import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCalculator {
	private final String BASIC_REGEX = ",|:";
	private List<String> numbers;
	StringCalculator(){
		numbers = new ArrayList<>();
	}

	int add(String text){
		numbers = Stream.of(text.split(BASIC_REGEX))
			.map(i -> {
				if(i.isEmpty() || i.equals("")){
					return "0";
				}else return i;
			})
			.collect(toList());

		return numbers.stream()
			.mapToInt(i -> Integer.parseInt(i)).sum();
	}
}
