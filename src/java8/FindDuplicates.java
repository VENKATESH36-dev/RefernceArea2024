package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1,2,3,4,1,2,4,5,6,7,8,9);
		
		Set<Integer> set = new HashSet<Integer>();
		
		numbers.stream().map(p->p).filter(x-> !set.add(x)).forEach(a->System.out.println(a));
	}

}
