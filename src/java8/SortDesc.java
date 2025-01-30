package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("Venkat", "Adnan", "Basmit", "Lokesh");
		
		List<String> values = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(values);
	}

}
