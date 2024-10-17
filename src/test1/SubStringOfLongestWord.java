package test1;

import java.util.Arrays;

public class SubStringOfLongestWord {

	public static void main(String[] args) {
		
		
		String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
		String toSearch = "ODG";
		
		System.err.println(subStringOfLongestWord(dict, toSearch));

	}
	
	public static String subStringOfLongestWord(String[] arr, String str) {
		
		String longestWord = "";
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++)
			if(arr[i].contains(str) && arr[j].contains(str)) {
				if(arr[i].toCharArray().length < arr[j].toCharArray().length) {
					longestWord = arr[j];
				}
				
			}
		}
		System.out.println("LongestWord:: "+longestWord);
		return longestWord;
	}

}
