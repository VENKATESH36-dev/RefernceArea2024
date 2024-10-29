package test1;

public class LongestPolindromSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "forgeeksskeegfor";
		String[] result = longestPalindrome(str);

		System.out.println("Longest Palindrome: \"" + result[0] + "\", Length: " + result[1]);

	}

	public static String[] longestPalindrome(String str) {
		if (str == null || str.isEmpty()) {
			return new String[] { " ", "0" };
		}

		int maxLength = 0;
		int start = 0;

		for (int i = 0; i < str.length(); i++) {
			int length1 = expandAroundCenter(str, i, i);

			int length2 = expandAroundCenter(str, i, i + 1);

			int length = Math.max(length1, length2);
			if (length > maxLength) {
				maxLength = length;
				start = i - (length - 1) / 2;
			}
		}
		String longestPalindrome = str.substring(start, start + maxLength);
		return new String[] { longestPalindrome, String.valueOf(maxLength)};
	}

	private static int expandAroundCenter(String str, int left, int right) {

		while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
			left--;
			right++;
		}
		return right - left - 1;
	}
}
