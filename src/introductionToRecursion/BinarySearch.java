package introductionToRecursion;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] array = {1,2,3,45,55,66,77};
		int target = in.nextInt();
		System.out.println(binarySearch(array,target,0,array.length - 1));
	}
	
	static int binarySearch(int [] array, int target, int start, int end) {
		
		if(start > end) {
			return -1;
		}
		int middle = (start + end) / 2;
		if(array[middle] == target)
			return middle;
		else if(array[middle] < target)
			return binarySearch( array,target, middle + 1, end);
		else
			return binarySearch( array,target, start, middle - 1);
	}
}
