package calculator;

import static calculator.Constant.*;
import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.stream.Stream;

public class StringCalculator {
	private List<String> regexList;
	private List<String> numbers;

	StringCalculator(){
		numbers = new ArrayList<>();
		regexList = new ArrayList<>();
		regexList.add(",");
		regexList.add(":");
	}

	int add(String text){
		Matcher m = CUSTOM_REGEX_PATTERN.matcher(text);
		if(m.find()){
			regexList.add(m.group(1));
			text = m.group(2);
		}

		String regex = String.join(DIVISION, regexList);
		numbers = Stream.of(text.split(regex))
			.map(i -> {
				if(i.isEmpty() || i.equals("")){
					return "0";
				}else return i;
			}).collect(toList());

		return numbers.stream().mapToInt(i -> Integer.parseInt(i)).sum();
	}

}
