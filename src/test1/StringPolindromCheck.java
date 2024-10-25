package test1;

public class StringPolindromCheck {

	public static void main(String[] args) {
		String testString = "A man, a plan, a canal, Panama";
		if (isPalindrome(testString)) {
			System.out.println("'" + testString + "' is a palindrome.");
		} else {
			System.out.println("'" + testString + "' is not a palindrome.");
		}
	}

	public static boolean isPalindrome(String s) {
		// Remove non-alphanumeric characters and convert to lowercase
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		int left = s.length() / 2 - 1; // Middle-left index
		int right = (s.length() + 1) / 2; // Middle-right index

		// Expand from the middle outwards
		while (left >= 0 && right < s.length()) {
			if (s.charAt(left) != s.charAt(right)) {
				return false; // Not a palindrome
			}
			left--;
			right++;
		}
		return true; // Palindrome
	}

}
