package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWithPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(2,224,234,567,894,432,236,211,122);
		
		List<Integer> numbers = list.stream().map(p->String.valueOf(p)).filter(a->a.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList());
		System.err.println("NumberStartsWithPrefix:: "+numbers);
		
		List<Integer> values = list.stream().map(p->String.valueOf(p)).filter(a->a.endsWith("4")).map(Integer::valueOf).collect(Collectors.toList());
		System.out.print("NumberEndsWithSufix :: "+values);
	}

}
