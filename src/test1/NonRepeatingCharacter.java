package test1;

import java.util.HashMap;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1122334556";
		Character result = nonRepeatingCharacter(str);
		System.out.println(result);
	}
	
	public static Character nonRepeatingCharacter(String str) {
		
		HashMap<Character, Integer> charcters = new HashMap<Character, Integer>();
		
		for(char ch: str.toCharArray()) {
			charcters.put(ch, charcters.getOrDefault(ch, 0)+1);
		}
		
		for(char ch: str.toCharArray()) {
			if(charcters.get(ch) == 1) {
				return ch;
			}
		}
		
		return null;
	}
}
