package test1;

public class LongestUniformSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcabcbbd";
		findLongestUniformSubString(str);
	}

	public static void findLongestUniformSubString(String str) {

		if (str == null || str.isEmpty()) {
			System.out.println("Provided String is Empty:: ");
			return;
		}

		int maxStart = 0;
		int maxLength = 1;
		int currentStart = 0;
		int currentLength = 1;

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				currentLength++;
			} else {
				if (currentLength > maxLength) {
					maxLength = currentLength;
					maxStart = currentStart;
				}
				currentStart = i;
				currentLength = 1;
			}
		}
		if (currentLength > maxLength) {
			maxLength = currentLength;
			maxStart = currentStart;

		}
		String longestString = str.substring(maxStart, maxStart + maxLength);
		System.out.println("StartIndex:: " + maxStart + ",  SubString:: \"" + longestString + "\"");

	}
}
