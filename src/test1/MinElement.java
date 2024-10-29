package test1;

public class MinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 5, 6, 1, 2, 3 };
		System.out.println(minimumElementFromSortedArray(arr));
	}

	public static int minimumElementFromSortedArray(int arr[]) {

		int left = 0;
		int right = arr.length-1;
		if(arr[left] < arr[right]) {
			return arr[left];
		}

		while(left<right) {
			int mid=left+(right-left)/2;
			if(arr[mid]>arr[right]) {
				left=mid+1;
			}else {
				right=mid;
			}
		}

		return arr[left];

	}
}
