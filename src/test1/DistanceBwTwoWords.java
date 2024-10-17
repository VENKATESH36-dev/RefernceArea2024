package test1;

public class DistanceBwTwoWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "the quick colour brown and blue frog";
		String word1 = "the";
		String word2 = "frog";

		int distance = distanceBetweenTwoWords(str, word1, word2);
		System.out.println(distance);

	}

	public static int distanceBetweenTwoWords(String str, String word1, String word2) {

		String[] arr = str.split(" ");
		int index1 = -1;
		int index2 = -1;
		int distance = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i].equals(word1)) {
				index1 = i;
			}
			if (arr[i].equals(word2)) {
				index2 = i-1;
			}
			if (index1 != -1 && index2 != -1) {
				distance = Math.min(distance, Math.abs(index1 - index2));
			}
		}
		return distance == Integer.MAX_VALUE ? -1 : distance;
	}
}
