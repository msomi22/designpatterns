package demo.test.string;

import java.util.Scanner;
import java.util.*;

public class Bob {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter number of test cases:");
		int testCases = in.nextInt();
		System.out.println("Number of test cases " + testCases);

		int testCaseCount = 0;
		int size = 0;
		while (testCaseCount <= testCases) {
			System.out.println("Enter array size:");
			in = new Scanner(System.in);
			size = in.nextInt();
			System.out.println("Array size " + size);
			int count = 1;
			Map<Integer,Integer> map = new TreeMap<>();
			while (in.hasNextInt() && count <= size) {
				int input = in.nextInt();
				map.put(input, count);
				System.out.println("Input " + input + " count = " + count);
				count++;
			}
			map.values().forEach(i -> {
				System.out.print(i + " ");
			});
			System.out.println();
			System.out.println("============= " + testCaseCount + " ================");
			testCaseCount++;
		}

	}

}
