package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHigestAndLowest {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,2,4,5,6,7,7,5,8,9,10,10,20,30);
		
		int secondHighestNum = numbers.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
		System.out.println(secondHighestNum);
		
		int secondLowestNum = numbers.stream().sorted(Comparator.comparing(p->p)).limit(2).skip(1).findFirst().get();
		
		System.out.println(secondLowestNum);
	}
}
