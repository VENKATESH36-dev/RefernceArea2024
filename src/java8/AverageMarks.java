package java8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> marks = Arrays.asList(21,23,34,56,45,56,67,78,89);
		
		OptionalDouble avgmarks = marks.stream().mapToInt(p->p).average();
		
		System.out.println(avgmarks);
	}

}
