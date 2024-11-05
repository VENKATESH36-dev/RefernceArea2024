package test1;

public class FractionAddition {

	public static void main(String[] args) {
		// Example 1
		int num1 = 1, den1 = 3;
		int num2 = 3, den2 = 9;
		int[] result1 = addFractions(num1, den1, num2, den2);
		System.out.println("Result: " + result1[0] + "/" + result1[1]); // Expected: 2/3

		// Example 2
		int num3 = 1, den3 = 2;
		int num4 = 3, den4 = 2;
		int[] result2 = addFractions(num3, den3, num4, den4);
		System.out.println("Result: " + result2[0] + "/" + result2[1]); // Expected: 2/1
	}

	// Method to calculate GCD
	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
	// Method to calculate LCM
	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

	// Method to add two fractions and return them in simplest form
	public static int[] addFractions(int num1, int den1, int num2, int den2) {
		// Calculate LCM of the two denominators
		int commonDenominator = lcm(den1, den2);

		// Convert fractions to have the same denominator
		int newNum1 = num1 * (commonDenominator / den1);
		int newNum2 = num2 * (commonDenominator / den2);

		// Add the numerators
		int numeratorSum = newNum1 + newNum2;

		// Simplify the resulting fraction
		int gcd = gcd(numeratorSum, commonDenominator);
		int simplifiedNumerator = numeratorSum / gcd;
		int simplifiedDenominator = commonDenominator / gcd;

		return new int[] { simplifiedNumerator, simplifiedDenominator };
	}

}