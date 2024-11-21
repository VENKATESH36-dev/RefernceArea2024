package test1;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temperatures = {73,74,75,71,69,72,76,73};
		int[] result = dailyTemperatures(temperatures);
		System.out.println("dailyTemperatures:: "+Arrays.toString(result));
		
		int[] temperatures1 = {30,40,50,60};
		int[] result1 = dailyTemperatures(temperatures1);
		System.err.println("dailyTemperatures:: "+Arrays.toString(result1));
	}

	public static int[] dailyTemperatures(int[] temperatures) {

		int n = temperatures.length;
		int[] result = new int[n];
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
				int indx = stack.pop();
				result[indx] = i - indx;
			}
			stack.push(i);
		}
		return result;
	}
}
