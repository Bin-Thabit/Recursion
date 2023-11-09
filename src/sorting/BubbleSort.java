package sorting;

import java.util.Arrays;

public class BubbleSort {

	// Bubble sort Algorithm using recursion
	public static void main(String[] args) {
		int[] arr = {5,1,3,9,2,4};
		bubble(arr, arr.length - 1, 0);
		System.out.println(Arrays.toString(arr));
	}
 
	
	static void bubble(int[] arr , int loop, int index) {
		if(loop == 0)
			return;
		if(index < loop ) {
			if(arr[index] > arr[index+1]) {
				int temp = arr[index];
				arr[index] = arr[index+1];
				arr[index+1] = temp;
			}
		  bubble(arr, loop, index+1);
		 }
		else 
			bubble(arr, loop - 1, 0);	
	}
}
