package test1;

import java.util.HashMap;
import java.util.Map.Entry;

public class StringEncryption {

	public static void main(String[] args) {

		String str = "aabbbcccgg";
		System.out.println("After Encryption:: " + encryption(str));

	}

	public static String encryption(String str) {
		StringBuilder sb = new StringBuilder();
		int count = 1;

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				count++;
			} else {
				sb.append(str.charAt(i - 1)).append(count);
				count = 1;

			}

		}

		sb.append(str.charAt(str.length() - 1)).append(count);
		
		//2nd Approach
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		StringBuilder sb1 = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		
		for(Entry<Character, Integer> entry:map.entrySet()) {
			sb1.append(entry.getKey()).append(entry.getValue());
		}
		
		System.err.println(sb1);
		
		return sb.toString();
	}
}
