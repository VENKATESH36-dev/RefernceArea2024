package test1;

public class MedianOfArrays {

	public static void main(String[] args) {

		int arr1[] = { 2, 3, 5, 8 };
		int arr2[] = { 10, 12, 14, 16, 18, 20 };

		System.out.println(medianOfArrays(arr1, arr2));

	}

	public static double medianOfArrays(int[] arr1, int[] arr2) {

		double median = 0;
		int a1 = arr1.length;
		int a2 = arr2.length;
		int a3 = a1 + a2;
		/*
		 * int[] arr3 = new int[arr1.length + arr2.length]; System.arraycopy(arr1, 0,
		 * arr3, 0, a1); System.arraycopy(arr2, 0, arr3, a1, a2); Arrays.sort(arr3);
		 */
		int[] arr3 = mergeSortedArrays(arr1, arr2);

		if (a3 % 2 == 0) {
			median = (double) (arr3[((a3 - 1) / 2)] + arr3[((a3 + 1) / 2)]) / 2;
		} else if (a3 % 2 == 1) {
			median = (double) (arr3[(a3 / 2)]);
		}

		return median;
	}

	public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;

		// Merge smaller elements first
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				result[k++] = arr1[i++];
			} else {
				result[k++] = arr2[j++];
			}
		}
		// Copy remaining elements from arr1, if any
		while (i < arr1.length) {
			result[k++] = arr1[i++];
		}

		// Copy remaining elements from arr2, if any
		while (j < arr2.length) {
			result[k++] = arr2[j++];
		}

		return result;
	}

}
