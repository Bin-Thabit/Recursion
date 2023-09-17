package patterns;

public class Triangle2 {

	public static void main(String[] args) {
		triangle(1,0);
	}
	
	// Print this pattern using recursion
		/*
				 *
				 **
				 ***
				 ****
		 */
	static void triangle(int r, int c) {
		if(r == 5)
			return;
		if(c < r) {
			System.out.print("*");
			triangle(r, c+1);
		}
		else {
			System.out.println();
			triangle(r + 1, 0);
		}
	}
}
