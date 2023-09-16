package introductionToRecursion;

public class SumOfDigits {

	public static void main(String[] args) {
		int ans = sumOfDigits(1432);
		System.out.println(ans);
	}
	
	static int sumOfDigits(int n) {
		if(n == 0)
			return 0;
		return sumOfDigits(n / 10) + n % 10;
	}
}
