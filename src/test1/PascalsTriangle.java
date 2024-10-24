package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please Enter the NumOfRows:: ");
		int numRows = scanner.nextInt();

		List<List<Integer>> list = preRows(numRows);
		System.out.println(list);
		scanner.close();
	}

	public static List<List<Integer>> preRows(int numRows) {
		int[] result = { 1 };

		List<List<Integer>> list = new ArrayList<>();
		for (int i = 1; i < numRows; i++) {
			result = solution(result);
			List<Integer> rowList = new ArrayList<Integer>();
			for(int num :result) {
				rowList.add(num);
			}
			list.add(rowList);
		}
		return list;
	}

	public static int[] solution(int[] prevRow) {
		int[] result = new int[prevRow.length + 1];
		for (int i = 0; i < result.length; i++) {
			if (i == 0) {
				result[i] = prevRow[0];
			} else if (i == result.length - 1) {
				result[i] = prevRow[prevRow.length - 1];
			} else {
				result[i] = prevRow[i - 1] + prevRow[i];
			}
		}
		return result;
	}
}
