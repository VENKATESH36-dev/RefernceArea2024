package java8;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "java 8 brings functional program into java";
		
		String longestWord =Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).orElse(null);
		
		System.out.println(longestWord);
	}

}
