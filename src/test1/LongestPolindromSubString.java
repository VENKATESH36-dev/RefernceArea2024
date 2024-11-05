package test1;

public class LongestPolindromSubString {

	public static void main(String[] args) {
		// Sample string to test for the longest palindromic substring
		String str = "forgeeksskeegfor";

		// Call the longestPalindrome method to find the longest palindromic substring
		String[] result = longestPalindrome(str);

		// Print the result: longest palindromic substring and its length
		System.out.println("Longest Palindrome: \"" + result[0] + "\", Length: " + result[1]);
	}

	/**
	 * Method to find the longest palindromic substring in a given string.
	 *
	 * @param str the input string
	 * @return a String array containing the longest palindromic substring and its
	 *         length
	 */
	public static String[] longestPalindrome(String str) {
		// Handle edge case: if the string is null or empty, return empty result
		if (str == null || str.isEmpty()) {
			return new String[] { " ", "0" };
		}

		int maxLength = 0; // Track the length of the longest palindromic substring
		int start = 0; // Track the starting index of the longest palindromic substring

		// Loop through each character in the string as a potential center of a palindrome
		for (int i = 0; i < str.length(); i++) {
			// Check for the longest palindrome centered around a single character (odd-length)
			int length1 = expandAroundCenter(str, i, i);

			// Check for the longest palindrome centered between two characters (even-length)
			int length2 = expandAroundCenter(str, i, i + 1);

			// Take the maximum length found between the odd and even centered palindromes
			int length = Math.max(length1, length2);

			// Update maxLength and start if a longer palindrome is found
			if (length > maxLength) {
				maxLength = length; // Update the longest length
				start = i - (length - 1) / 2; // Calculate the starting index of the palindrome
			}
		}

		// Extract the longest palindromic substring from the original string using the start index and maxLength
		String longestPalindrome = str.substring(start, start + maxLength);

		// Return the longest palindrome and its length as a String array
		return new String[] { longestPalindrome, String.valueOf(maxLength) };
	}

	/**
	 * Helper method to expand around the center and calculate the length of the
	 * palindrome.
	 *
	 * @param str   the input string
	 * @param left  the left index to start expanding from
	 * @param right the right index to start expanding from
	 * @return the length of the palindrome found by expanding around the center
	 */
	private static int expandAroundCenter(String str, int left, int right) {
		// Expand as long as left and right characters are equal and within the bounds of the string
		while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
			left--; // Move left pointer one step to the left
			right++; // Move right pointer one step to the right
		}
		// Return the length of the palindrome (right - left - 1) after the last successful expansion
		return right - left - 1;
	}
}
