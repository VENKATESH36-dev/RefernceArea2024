package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(1,2,3,2,4,5,6,7,7,5,8,9,10,10,20,30);
		
		System.out.println("Total Size::"+numbers.size());
		List<Integer> limitedValues = numbers.stream().limit(5).collect(Collectors.toList());
		System.err.println("LimitedValues:: "+limitedValues);
		
		int limitSum = numbers.stream().limit(5).reduce((a1, a2)->a1+a2).get();
		System.out.println("Sum Of first 5 numbers:: "+limitSum);
		
		List<Integer> skipedValues = numbers.stream().skip(5).collect(Collectors.toList());
		System.err.println("Remaining Values:: "+skipedValues);
		
		List<Integer> squares = numbers.stream().map(p->p*p).collect(Collectors.toList());
		System.out.println("Squares:: "+squares);
	}

}
