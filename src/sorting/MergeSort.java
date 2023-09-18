package sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {5,1,3,9,2,4};
		arr = mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}
 
	static int[] mergeSort(int[] arr) {
		if(arr.length == 1)
			return arr;
		int mid = arr.length / 2;
		int [] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int [] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		return merge(left, right);
	}
	
	static int[] merge(int[] start , int[] second) {
		// Size = start.length + second.length
		int[] mix = new int[start.length + second.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < start.length && j < second.length) {
			if(start[i] < second[j]) {
				mix[k] = start[i];
				i++;
			}
			else {
				mix[k] = second[j];
				j++;
			}
			k++;
		}
		
		// It may be possible that one of the arrays is not complete
		// Copy the remaining elements
		while(i < start.length) {
			mix[k] = start[i];
			i++;
			k++;
		}
		
		while(j < second.length) {
			mix[k] = second[j];
			j++;
			k++;
		}
		return mix;
	}
}
