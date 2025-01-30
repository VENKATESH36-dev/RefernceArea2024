package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		
		List<Integer> reversenumbers = numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(reversenumbers);
	}

}
