package test1;

import java.util.ArrayList;
import java.util.List;

public class FindBuildingWithOceanView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 6, 7, 4, 5, 2 };
		System.out.println(findBuildingWithOceanView(arr));
	}

	public static List<Integer> findBuildingWithOceanView(int[] arr) {
		int max = Integer.MIN_VALUE;
		List<Integer> arr1 = new ArrayList<Integer>();
		
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]>max) {
				arr1.add(arr[i]);
				max=arr[i];
			}
		}

		return arr1;
	}
}
