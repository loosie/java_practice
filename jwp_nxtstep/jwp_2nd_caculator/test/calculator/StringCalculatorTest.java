package calculator;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	private StringCalculator cal;

	@BeforeEach
	public void setup(){
		cal = new StringCalculator();
	}

	@Test
	public void default_add(){
		String[] inputs = {"1:2,3", "1,2,3", "1:2:3"};
		Arrays.stream(inputs).forEach(input -> assertEquals(cal.add(input), 6));
	}
}