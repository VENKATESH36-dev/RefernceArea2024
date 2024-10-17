package test1;

public class ConvertIntoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "123";
		System.out.println(convertion(str));
	}

	public static int convertion(String str) {
		str = str.trim();

		if (str.isEmpty()) {
			return -1;
		}
		int sign = 1;
		int index = 0;
		int result = 0;
		if (str.charAt(index) == '-') {
			sign = -1;
			index++;
		} else if (str.charAt(index) == '+') {
			index++;
		}

		while (index < str.length()) {
			char currentCharacter = str.charAt(index);
			if (!Character.isDigit(currentCharacter)) {
				return -1;
			}

			result = result * 10 + (currentCharacter - '0');

			if (result * sign > Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			}
			if (result * sign < Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			}

			index++;
		}

		return (int) result * sign;
	}

}
