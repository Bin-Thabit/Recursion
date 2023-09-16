package introductionToRecursion;

public class Fibonacci {

	
	static int fibo(int n) {
			
		if(n < 2)
			return n;
		else
			return fibo(n-1) + fibo(n-2);
	}
	
	static int fiboFormula(int n) {
		return (int) (Math.pow(((1 + Math.sqrt(5)) / 2),n) / Math.sqrt(5));
	}
	public static void main(String[] args) {
		//System.out.println("fibonacci = " + fibo(50) );
		
		for (int i = 1; i < 11; i++) {
			System.out.println(fiboFormula(i));
		}
	}
}
