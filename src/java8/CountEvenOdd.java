package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
		
	 Map<Boolean, Long> evenOddCount = numbers.stream().collect(Collectors.partitioningBy(a->a%2==0, Collectors.counting()));
		
	 System.out.println("EvenCount:: "+evenOddCount.get(true));
	 System.err.println("OddCount:: "+evenOddCount.get(false));
	}

}
