package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(1,2,3,2,4,5,6,7,7,5,8,9,10,10);
		
		Set<Integer> set = new HashSet<Integer>();
		//1st Approach
		List<Integer> duplicateNumbers = numbers.stream().filter(p->!set.add(p)).collect(Collectors.toList());
		
		System.out.println(duplicateNumbers);
		
		//2nd Approach
		Set<Integer> duplicateVlues = numbers.stream().filter(a->Collections.frequency(numbers, a)>1).collect(Collectors.toSet());
		
		System.err.println("Duplicatevalues:: "+duplicateVlues);
	}

}
