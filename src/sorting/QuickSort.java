package sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {5,1,3,9,2,4};
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
 
	static void quickSort(int[] arr, int low , int high) {
		if(low >= high)
			return;
		int start = low;
		int end = high;
		int mid = start + (end - start) / 2;
		while(start <= end) {
			while(arr[start] < arr[mid]) {
				start++;
			}
			
			while(arr[end] > arr[mid]) {
				end--;
			}
			
			if(start <= end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
		// Now my pivot is at the correct index, please sort two half 
		quickSort(arr,low,end);
		quickSort(arr,start,high );
	}
}
