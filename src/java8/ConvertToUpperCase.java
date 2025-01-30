package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("venkat", "Amith", "Adnan", "NagaLakshmi");
		
		List<String> uppercase =  names.stream().map(p->p.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(uppercase);
		
	}

}
