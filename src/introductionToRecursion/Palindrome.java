package introductionToRecursion;

public class Palindrome {

	public static void main(String[] args) {
		boolean ans = isPalind(1234321);
		System.out.println(ans);
	}
	
	static int rev(int n) {
		int digits = (int)(Math.log10(n)) + 1;
		return helper(n , digits);
	}
	
	static int helper(int n , int digits) {
		if(n % 10 == n)
			return n;
		int rem = n % 10;
		return rem * (int)(Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
	}
	
	static boolean isPalind(int n) {
		int rev = rev(n);
		if(n == rev)
			return true;
		else
			return false;
	}
}
