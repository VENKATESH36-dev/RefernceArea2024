package test1;

import java.util.HashMap;
import java.util.Map;

public class StudentAverage {
	public static void main(String[] args) {
		String[][] students = { { "Charles", "84" }, { "John", "100" }, { "Andy", "37" }, { "John", "23" },
				{ "Charles", "20" } };

		Result result = calculateHighestAverage(students);

		System.out.printf("The highest average marks: %.2f (Student: %s)%n", result.average, result.name);
	}

	public static Result calculateHighestAverage(String[][] students) {
		Map<String, int[]> studentData = new HashMap<>();

		// Accumulate marks for each student
		for (String[] entry : students) {
			String name = entry[0];
			int mark = Integer.parseInt(entry[1]);

			studentData.putIfAbsent(name, new int[2]); // [0] for total marks, [1] for count
			studentData.get(name)[0] += mark; // Add marks
			studentData.get(name)[1]++; // Increment count
		}

		String topStudent = null;
		double highestAverage = Double.NEGATIVE_INFINITY;

		// Calculate averages and find the highest
		for (Map.Entry<String, int[]> entry : studentData.entrySet()) {
			String name = entry.getKey();
			int totalMarks = entry.getValue()[0];
			int count = entry.getValue()[1];
			double average = (double) totalMarks / count;

			if (average > highestAverage) {
				highestAverage = average;
				topStudent = name;
			}
			
			
		}

		return new Result(topStudent, highestAverage);
	}

	static class Result {
		String name;
		double average;

		Result(String name, double average) {
			this.name = name;
			this.average = average;
		}
	}
}
