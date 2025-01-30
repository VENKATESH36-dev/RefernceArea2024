package test1;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentHighestAvgMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] students = { { "Charles", "84" }, { "John", "100" }, { "Andy", "37" }, { "John", "23" },
				{ "Charles", "20" } };

		Result result = calculateHighestAvgMarks(students);

		System.out.printf("The highest average marks: %.2f (Student: %s)%n", result.average, result.name);
	}
	
	public static Result calculateHighestAvgMarks(String[][] students) {

		Map<String, Double> averages = Arrays.stream(students).
				collect(Collectors.groupingBy(s -> s[0],
				Collectors.averagingDouble(s -> Double.parseDouble(s[1]))));
		
		Map.Entry<String, Double> highest = averages.entrySet().stream().
				max(Map.Entry.comparingByValue()).
				orElseThrow(()->new RuntimeException("no students found"));
		
		return new Result(highest.getKey(), highest.getValue());
		
	}
	
	static class Result{
		private String name;
		private double average;
		
		public Result(String name, double average) {
			this.name = name;
			this.average = average;
		}
		public String getName() {
	        return name;
	    }

	    public double getAverage() {
	        return average;
	    }

	    @Override
	    public String toString() {
	        return "Name: " + name + ", Average: " + average;
	    }
	}
}
