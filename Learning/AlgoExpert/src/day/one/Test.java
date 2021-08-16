package day.one;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no = 104;
		System.out.println("==" + Arrays.toString(solution(no)));

	}

	static int[] solution(int N) {
		if (N <= 10)
			return new int[] { 1, N - 1 };

		// split n to: 99..9 and rest
		int a = 9;
		while (N > a * 10 + 9)
			a = a * 10 + 9;

		// eliminate the "0" in another part
		int b = N - a, digit = 1;
		while (b > 0) {
			if (b % 10 == 0)
				a -= digit;
			b /= 10;
			digit *= 10;
		}

		return new int[] { a, N - a };
	}

}
