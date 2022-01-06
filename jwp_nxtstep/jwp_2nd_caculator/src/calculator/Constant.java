package calculator;

import java.util.regex.Pattern;

public final class Constant {
	public static final String CUSTOM_REGEX = "//(.)\n(.*)";
	public static final Pattern CUSTOM_REGEX_PATTERN = Pattern.compile(CUSTOM_REGEX);
	public static final String DIVISION = "|";
}
