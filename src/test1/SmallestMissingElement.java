package test1;

public class SmallestMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 0, 1, 3, 4 };
		
		System.out.println("Smallest missing integer in arr1:: "+findSmallestMissingInteger(arr1));
		System.out.println("Smallest missing integer in arr2:: "+findSmallestMissingInteger(arr2));
	}

	public static int findSmallestMissingInteger(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i) {
				return i;
			}
		}
		return arr.length;
	}
}
