package java8;

import java.util.Arrays;
import java.util.OptionalInt;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,3,4,1,5,8,5,6,7};
		
		OptionalInt value = Arrays.stream(arr).distinct().boxed().sorted((a,b)->b-a).skip(1).mapToInt(Integer::intValue).findFirst();
		
		System.out.print(value);
	}

}
