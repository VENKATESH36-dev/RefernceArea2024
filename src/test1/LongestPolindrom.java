package test1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestPolindrom {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the string:: ");
		String str = scanner.nextLine();
		int longestPolindrom = longestPolindrom(str);
		System.out.println("longestPolindrom:: " + longestPolindrom);
		scanner.close();
	}

	public static int longestPolindrom(String str) {

		Set<Character> set = new HashSet<Character>();
		int count = 0;

		for (char ch : str.toCharArray()) {
			if (!set.contains(ch)) {
				set.add(ch);
			} else {
				set.remove(ch);
				count++;
			}
		}
		return count * 2 + (set.isEmpty() ? 0 : 1);
	}
}
