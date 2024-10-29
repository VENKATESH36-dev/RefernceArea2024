package test1;

public class PowerOfTenChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12;
		boolean result = isPowerOfTen(num);
		System.out.println("is Power of Ten:: "+result);
	}
	
	public static boolean isPowerOfTen(int num) {
		
		if(num <=0) {
			return false;
		}
		while(num>1) {
			if(num%10 != 0) {
				return false;
			}
			num /=10;
		}
		
		return true;
	}
}
