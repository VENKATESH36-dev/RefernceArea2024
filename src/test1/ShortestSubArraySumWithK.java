package test1;

import java.util.HashMap;
import java.util.Map;

public class ShortestSubArraySumWithK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 4, 6, 10, 2, 1 };
		int k = 12;
		System.out.println("shortestSubArraylength::    " + shortestSubArraylength(arr, k));

		int[] arr1 = { 5, 8, 50, 4 };
		int k1 = 50;
		System.err.println("shortestSubArraylength::    " + shortestSubArraylength(arr1, k1));

	}

	public static int shortestSubArraylength(int[] arr, int k) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int currentSum = 0;
		int minLength = Integer.MAX_VALUE;

		map.put(0, -1);
		for (int i = 0; i < arr.length; i++) {
			currentSum += arr[i];
			if (map.containsKey(currentSum - k)) {
				int length = i - map.get(currentSum - k);
				minLength = Math.min(minLength, length);
			}
			map.put(currentSum, i);
		}

		return minLength == Integer.MAX_VALUE ? -1 : minLength;
	}
}
