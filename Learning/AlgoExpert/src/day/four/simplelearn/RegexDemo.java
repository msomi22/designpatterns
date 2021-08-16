package day.four.simplelearn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	
	public static void main(String[] a) {
		String regex = "[p.]";
		regex = ".*[0-9].";
		String s = "0aapeter";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		
		System.out.println("" + m.find());
	}

}
