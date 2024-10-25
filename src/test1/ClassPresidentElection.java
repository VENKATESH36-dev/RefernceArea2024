package test1;

public class ClassPresidentElection {

	public static void main(String[] args) {
		int n = 4;
		int k = 2;
		int classPresindent = findClassPresident(n, k);
		System.out.println(" The elected class president number is:: " + classPresindent);
	}

	public static int findClassPresident(int n, int k) {

		int safePosition = 0;

		for (int i = 2; i <= n; i++) {
			safePosition = (safePosition + k) % i;
		}
		return safePosition + 1;
	}
}