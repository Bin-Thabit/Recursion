package introductionToRecursion;

public class CountZero {

	public static void main(String[] args) {
		int ans = countZero(3030);
		System.out.println(ans);
	}
 
	static int countZero(int n) {
		if(n == 0)
			return 1;
		return helper(n, 0);
	}
	
	static int helper(int n , int c) {
		if(n == 0)
			return c;
		if(n % 10 == 0)
			return helper(n / 10, c + 1);
		else
			return helper(n / 10, c);
	}
}
