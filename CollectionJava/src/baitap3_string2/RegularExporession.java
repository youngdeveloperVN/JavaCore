package baitap3_string2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExporession {
	static Pattern MY_PATTERN = Pattern.compile("\\((.*?)\\)");

	public static void main(String[] args) {
		String input = "AC[4] (5)AC[4] (6)AC[4] (6)";
		Matcher m = MY_PATTERN.matcher(input);
		while (m.find()) {
			String s = m.group(1);
			System.out.println(s);
		}
	}
}
