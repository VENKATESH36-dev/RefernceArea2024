package java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "swweiss";
		
		Character result = str.chars().mapToObj(p->(char)p)
				.collect(Collectors.groupingBy(a->a, LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream()
				.filter(entry->entry.getValue() == 1)
				.map(Map.Entry::getKey)
				.findFirst()
				.orElse(null);
				
		
		System.out.println(result);
				 
	}

}
