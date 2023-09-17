package ArrayQuestions;

public class SearchRotated {

	
	 // https://leetcode.com/problems/search-in-rotated-sorted-array/description/
	 // 33. Search in Rotated Sorted Array
	int search(int[] arr, int target) {
		int start = 0;
	    int end = arr.length - 1;
	    return binarySearch(arr, target, start , end);
	  }

	int binarySearch(int[] arr, int target, int start, int end) {
		if(start > end)
			return -1;
		int mid = start + (end - start) / 2;
		if(arr[mid] == target)
			return mid;
		else if(arr[start] <= arr[mid]) {
			if(target >= arr[start] && target <= arr[mid])
				return binarySearch(arr, target, start, mid - 1);
			else
				return binarySearch(arr, target, mid + 1, end);
						}
			else if(target >= arr[mid] && target <= arr[end])
				return binarySearch(arr, target, mid + 1, end);
			
		return binarySearch(arr, target, start, mid - 1); 
	}
}
