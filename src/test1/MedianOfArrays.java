package test1;

import java.util.Arrays;

public class MedianOfArrays {

	public static void main(String[] args) {
		int arr1[] = {2, 3, 5, 8};
		int arr2[] = {10, 12, 14, 16, 18, 20};
		
		System.out.println(medianOfArrays(arr1, arr2));
	}
	
	public static double medianOfArrays(int[] arr1, int[] arr2) {
		
		double median = 0;
		int a1 = arr1.length;
		int a2 = arr2.length;
		int a3 = a1+a2;
		int[] arr3 = new int[a3];
		System.arraycopy(arr1, 0, arr3, 0, a1);
		System.arraycopy(arr2, 0, arr3, a1, a2);
		Arrays.sort(arr3);
		for(int i=0;i<a3;i++) {
			if(a3%2==0) {
				 median = (double)(arr3[((a3-1)/2)]+arr3[((a3+1)/2)])/2;
			}else if(a3%2 == 1) {
				 median = (double)(arr3[(a3/2)]);
			}
		}
		return median;
	}

}
