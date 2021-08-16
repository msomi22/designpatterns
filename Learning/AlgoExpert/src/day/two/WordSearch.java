package day.two;

import java.util.*;

public class WordSearch {

	public static void main(String[] args) {
		
		//https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/
		
		String bank = "This song is my son, this is my song";
		String word = "song";
		System.out.println(wordSearch(bank, word));
		
		String s = "dvdf";//dv df
		
		int out = longestSubStringNonRepeat(s);//abcabcbbzz
		System.out.println("=====>>" + out);
		
	}

	private static int longestSubStringNonRepeat(String s) {
		Set<Character> set = new HashSet<>();
		int out = 0, prev = 0;
		for(char ch : s.toCharArray()) {
			if(!set.add(ch)) {
				out = set.size();
				if(prev > out) {
					out = prev;
				}
				System.out.println("=====>>" + set + "==" + out + " = " + prev);
				set.clear();
				set.add(ch);
				prev = out;
			}		
		}
		System.out.println("=====>>" + set + "---->" + out );
		if(out > set.size()) return out;
		return set.size();
	}

	/**
	 * 
	 * @param bank
	 * @param word
	 * @return
	 */
	private static String wordSearch(String bank, String word) {
		String output = "";
		for(int i=0;i<bank.length();) {
			for(int j=0;j<word.length();) {
				if(bank.charAt(i)==word.charAt(j)) {
					output += word.charAt(j);
					j++;i++;
				}else {
					i++;
				}
			}
			if(output.equals(word)) break;
		}
		return output;
	}

}
