package test1;

import java.util.HashMap;

public class FractionalDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Result: " + fractionToDecimal(1, 2));       // Output: "0.5"
        System.out.println("Result: " + fractionToDecimal(1, -2));      // Output: "-0.5"
        System.out.println("Result: " + fractionToDecimal(50, 22));     // Output: "2.(27)"
	}

	public static String fractionToDecimal(int nuemarator, int denominator) {
		if (denominator == 0) {
			throw new IllegalArgumentException(" Denominator cann't be zero:: ");
		}

		StringBuilder result = new StringBuilder();
		if ((nuemarator < 0) ^ (denominator < 0)) {
			result.append("-");
		}
		long num = Math.abs((long) nuemarator);
		long denom = Math.abs((long) denominator);

		result.append(num / denom);
		long remainder = num % denom;

		if (remainder == 0) {
			return result.toString();
		}

		result.append(".");

		HashMap<Long, Integer> remainderMap = new HashMap<Long, Integer>();

		while (remainder != 0) {
			if (remainderMap.containsKey(remainder)) {
				int start = remainderMap.get(remainder);
				result.insert(start, "(");
				result.append(")");
				break;
			}

			remainderMap.put(remainder, result.length());

			remainder *= 10;
			result.append(remainder / denom);
			remainder %= denom;
		}
		return result.toString();
	}
}
