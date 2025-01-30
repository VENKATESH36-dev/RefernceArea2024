package java8;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentHighestAvgMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] students = { { "Charles", "84" }, { "John", "100" }, { "Andy", "37" }, { "John", "23" },
				{ "Charles", "20" } };

		Result result = highestAvgMarks(students);
		System.out.println(result.name + "-" + result.avgMarks);
	}

	public static Result highestAvgMarks(String[][] students) {

		Map<String, Double> averageMarks = Arrays.stream(students)
				.collect(Collectors.groupingBy(s -> s[0], Collectors.averagingDouble(s -> Double.parseDouble(s[1]))));

		Map.Entry<String, Double> highest = averageMarks.entrySet().stream().max(Map.Entry.comparingByValue())
				.orElseThrow(() -> new RuntimeException("The Student Data Not Found:: "));

		return new Result(highest.getKey(), highest.getValue());
	}

	static class Result {
		String name;
		double avgMarks;

		Result(String name, double avgMarks) {
			this.name = name;
			this.avgMarks = avgMarks;
		}
	}
}
