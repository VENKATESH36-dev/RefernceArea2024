package test1;

public class ArrayLoopLength {

	public static void main(String[] args) {
		int[] arr = { 2, -1, 1, 2, 2 };
		int loopLength = findLoopLength(arr);

		System.out.println("Loop length: " + loopLength);
	}

	public static int findLoopLength(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			int slow = i, fast = i;

			while (true) {
				slow = getNextIndex(arr, slow);
				fast = getNextIndex(arr, getNextIndex(arr, fast));

				if (slow == -1 || fast == -1 || slow == fast) {
					break;
				}
			}

			if (slow != -1 && slow == fast) {

				int length = 1;
				int start = slow;
				slow = getNextIndex(arr, slow);

				while (slow != start) {
					slow = getNextIndex(arr, slow);
					length++;
				}
				return length;
			}
		}
		return -1;
	}

	private static int getNextIndex(int[] arr, int index) {

		int n = arr.length;
		int nextIndex = (index + arr[index] + n) % n;

		if ((arr[index] > 0 && arr[nextIndex] < 0) || (arr[index] < 0 && arr[nextIndex] > 0) || nextIndex == index) {
			return -1;
		}
		return nextIndex;
	}
}
