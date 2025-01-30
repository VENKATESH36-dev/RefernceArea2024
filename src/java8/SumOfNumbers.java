package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(1,2,3);
		
		Optional<Integer> sumOfNumbers = numbers.stream().reduce((a,b)->(a+b));
		
		System.out.println(sumOfNumbers.get());
		
		
	}

}
