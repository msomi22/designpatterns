package day.four.cache_lru;

import java.util.*;

public class SumOfTwoNumber {

	public static void main(String[] args) {
		
		int[] arr = {10,4,5,16,19};
		int sum = 9;
		targetSum(arr, sum);
	}
	
	static int[] targetSum(int[] list, int sum) {
		HashMap<Integer, Integer> ints = new HashMap<>();
		System.out.println("Unsorted List...." + list);
		Arrays.sort(list);
		for (int i = 0; i < Arrays.stream(list).count() -1; i++) {
		    int secondDigit = sum - list[i];
		    if (ints.containsKey(secondDigit)) {
		        System.out.println("First Digit " +list[i]+ " second digit "+secondDigit);
		        ints.put(secondDigit, list[i]);
		        
		        System.out.println("Found......");
		    } else {
		        System.out.println("Not Found......");
		        ints.put(list[i], i);
		    }
		}
		return null;
	}

}
