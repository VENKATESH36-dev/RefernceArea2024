package java8;

import java.util.stream.IntStream;

public class ParllelStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long start =System.currentTimeMillis();
		
		int sum = IntStream.rangeClosed(1, 100000).parallel().sum();
		
		long end = System.currentTimeMillis();
		System.out.println("Sum: "+sum);
		System.out.println("TimeTaken: "+(end-start)+"ms");
	}

}
