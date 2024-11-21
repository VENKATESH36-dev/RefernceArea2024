package test1;

public class IncreasingTripletSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5};
		boolean result = increasingTripletSusequence(nums);
		System.out.println(result);
	}
	
	public static boolean increasingTripletSusequence(int[] nums) {
		
		if(nums == null || nums.length<3) {
			return false;
		}
		int firstNum=Integer.MAX_VALUE;
		int secondNum=Integer.MAX_VALUE;
		for(int num:nums) {
			if(num<=firstNum) {
				firstNum=num;
			}else if(num<=secondNum) {
				secondNum=num;
			}else {
				return true;
			}
		}
		return false;
	}
}
