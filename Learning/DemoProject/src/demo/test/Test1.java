package demo.test;

import java.util.*;

import javax.crypto.spec.SecretKeySpec;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> scores = new ArrayList<Integer>();

		scores.add(60);
		scores.add(80);
		scores.add(80);
		scores.add(20);
		scores.add(40);
		scores.add(100);
		Collections.sort(scores);
		System.out.println(scores);
		int k = 4;
		
		"".toCharArray();
		
		List<Integer> ranks = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		int rank = 0;
		for (int i = scores.size() - 1; i >= 0; i--) {
			int temp = scores.get(i);
		     if(set.add(temp)) {
		    	 rank++;
		     }
		     ranks.add(rank);
			System.out.println(rank + " " + temp);
		}
		System.out.println("ranks=" + ranks);
		int result = 0;
		for(int i : ranks) {
			if(i <= k) {
				result++;
			}
		}
		System.out.println("result=" + result);

	}
}
