package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = Arrays.asList("banana", "apple", "orange");
		
		List<String> list2 = Arrays.asList("chocolates", "pepparments", "mitai");
		
		List<String> mergeList = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		
		System.out.println(mergeList);
		
	}

}
