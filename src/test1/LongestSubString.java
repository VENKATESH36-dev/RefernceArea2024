package test1;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcabcbb";

		System.out.println("LongestSubString:: "+longestSubString(str));
	}

	public static String longestSubString(String str) {

		int left = 0;
		int maxlength = 0;
		int start = 0;
		Set<Character> set = new HashSet<Character>();
		StringBuilder sb = new StringBuilder();

		for (int right = 0; right < str.length(); right++) {
			while (set.contains(str.charAt(right))) {
				set.remove(str.charAt(left));
				left++;
			}
			set.add(str.charAt(right));
			if (right - left + 1 > maxlength) {
				maxlength = right - left + 1;
				start = left;
				
			}
		}
		sb.append(str.substring(start, maxlength));
		return sb.toString();
	}
}
