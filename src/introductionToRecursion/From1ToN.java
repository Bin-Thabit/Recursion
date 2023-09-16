package introductionToRecursion;

public class From1ToN {

	public static void main(String[] args) {
		// Write a function that takes a number and print it
		// Print first five number
		print(1);
	}
	
	static void print(int n) {
		if(n == 6)
			return;
		System.out.print(n + " ");
		print(n + 1);
			
	}
}
