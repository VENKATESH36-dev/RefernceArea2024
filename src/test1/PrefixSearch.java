package test1;

import java.util.ArrayList;
import java.util.List;

public class PrefixSearch {

	public static void main(String[] args) {
		
		String[] arr = {"apple", "applet", "bread", "aper"};
        String str = "app";
        
        List<String> result = prefixSearch(arr, str);
        System.out.println(result);
	}
	
	public static List<String> prefixSearch(String[] arr, String str){
		
		List<String> result = new ArrayList<String>();
		
		for(String word: arr) {
			if(word.startsWith(str)) {
				result.add(word);
			}
		}
		
		return result;
	}

}
