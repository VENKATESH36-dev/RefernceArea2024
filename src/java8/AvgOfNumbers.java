package java8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AvgOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,5,15,20};
		
		OptionalDouble value = Arrays.stream(arr).map(p->p).average();
		
		System.out.println(value);
		
		List<Integer> numbers = Arrays.asList(5,10,15,20,25,30);
		
		OptionalDouble average =numbers.stream().mapToInt(a->a).average();
		
		System.err.println(average);
	}

}
