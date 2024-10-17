package test1;

import java.util.HashMap;
import java.util.Iterator;

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
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		StringBuilder sb1 = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		
		Iterator<Character> iterator = map.keySet().iterator();
		Character ch = null;
		while (iterator.hasNext()) {
			ch = iterator.next();
			sb1.append(ch).append(map.get(ch));
		}
		System.out.println(sb1);
		
		return sb.toString();
	}
}
