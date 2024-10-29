package test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFormation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] dict1 = { "ab", "abcd", "bcdaf", "bcad", "acb", "acab" };
		String input1 = "abcd";
		String[] result1 = wordFromedFromInput(dict1, input1);
		System.out.println("Result for input1: " + String.join(", ", result1));

		String[] dict2 = { "ab", "abcd", "bcdaf", "bcad", "acaab", "acab" };
		String input2 = "caab";
		String[] result2 = wordFromedFromInput(dict2, input2);
		System.out.println("Result for input2: " + String.join(", ", result2));
	}

	// Method to check if a word can be formed using exact characters from input
	public static boolean canFormWord(String word, String input) {
		if (word.length() != input.length()) {
			return false; // Only words of the same length are considered
		}

		// Create frequency maps for the input and word
		Map<Character, Integer> inputMap = new HashMap<>();
		Map<Character, Integer> wordMap = new HashMap<>();

		for (char c : input.toCharArray()) {
			inputMap.put(c, inputMap.getOrDefault(c, 0) + 1);
		}
		for (char c : word.toCharArray()) {
			wordMap.put(c, wordMap.getOrDefault(c, 0) + 1);
		}

		// Compare frequency maps of input and word
		return inputMap.equals(wordMap);
	}

	// Method to find all words that can be formed from the input
	public static String[] wordFromedFromInput(String[] dict, String input) {
		List<String> result = new ArrayList<>();

		for (String word : dict) {
			if (canFormWord(word, input)) {
				result.add(word);
			}
		}

		return result.toArray(new String[0]);
	}
}
