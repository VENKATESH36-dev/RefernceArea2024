package test1;

public class BulbToggle {

	public static void main(String[] args) {
		int n = 100; // Number of bulbs
		boolean[] bulbs = new boolean[n + 1]; // Bulbs indexed from 1 to 100

		// Toggling bulbs
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j += i) {
				bulbs[j] = !bulbs[j]; // Toggle the bulb
			}
		}

		// Counting bulbs that are still on
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (bulbs[i]) {
				count++;
			}
		}

		System.out.println("Number of bulbs remaining on: " + count); // Output should be 10
	}
}