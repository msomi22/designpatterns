package day.three;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StringDemo {

	public static void main(String[] args) {

		System.out.println(s.length());
		System.out.println(s.codePoints().count());

		final double d1 = Double.NaN;
		final double d2 = Double.NaN;

		System.out.println(d1 == d2);
		System.out.println(Double.compare(d1, d2) == 0);

		final double d = 1 / 2;

		System.out.println(d);

		IntStream.range(0, 10).forEach(System.out::println);
		/**
		 * Amount=1000 Min=0.01 Min <= Amount Amount >= Min
		 */

		int min = 1;
		int max = 10;
		System.out.println(min <= max);
		System.out.println(max >= min);

	}

	public static boolean isAcronymMoreBetter(String s1, String s2) {
		char[] s1Chars = s1.toCharArray();
		char[] s2Chars = s2.toCharArray();
		Arrays.sort(s1Chars);
		Arrays.sort(s2Chars);
		return Arrays.equals(s1Chars, s2Chars);
	}

	static String s = "";

}
