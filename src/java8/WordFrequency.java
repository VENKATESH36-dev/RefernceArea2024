package java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "java is great and java is powerful";
		
		String[] arr = str.split(" ");
		
		Map<String, Long> map = Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		map.forEach((a,b)->{
			System.out.println(a+"-->"+b);
		});
	}

}
