package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(1,2,3,2,4,5,6,7,7,5,8,9,10,10,20,30);
		
		int maxValue = numbers.stream().max(Comparator.comparing(a->Integer.valueOf(a))).get();
		System.out.println("The MaximumValue:: "+maxValue);
		
		int maxNumber = numbers.stream().max((a1,a2)->(a1>a2)?1:-1).get();
		System.err.println("The MaximumNumber:: "+maxNumber);
		
		int minValue = numbers.stream().min(Comparator.comparing(p->Integer.valueOf(p))).get();
		System.out.println("The MinimumValue:: "+minValue);
		
		int minNumber = numbers.stream().min((a1,a2)->(a1<a2)?-1:1).get();
		System.err.println("The MinimumNumber:: "+minNumber);
	}

}
