package test1;

public class StairCase {

	public static void main(String[] args) {
		
		int n=5;
		System.out.println("StairCase program:: "+countWays(n));

	}
	public static int countWays(int n) {
		if(n<=1) {
			return 1;
		}
		
		int previousStep = 1;
		int currentStep = 2;
		
		for(int i=3;i<=n;i++) {
			int nextStep=previousStep+currentStep;
			previousStep=currentStep;
			currentStep = nextStep;
			
		}
		return currentStep;
	}
}
