package test1;

public class PowerOfTenChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 100;
		boolean result = isPowerOfTen(num);
		if (result) {
			System.out.println(num + "  is Power of Ten::  ");
		} else {
			System.out.println(num + "  is not a power of ten::  ");
		}
	}

	public static boolean isPowerOfTen(int num) {

		if (num <= 0) {
			return false;
		}
		while (num > 1) {
			if (num % 10 != 0) {
				return false;
			}
			num /= 10;
		}

		return true;
	}
}
