package ArrayQuestions;

public class SearchinRotatedSortedArrayII {

	// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
	// 33. Search in Rotated Sorted Array
	public boolean search(int[] nums, int target) {
	   int ans = check(nums , target);
	   if(ans == -1)
	      return false;
	   else
	      return true;    
	   }
	
    int check(int[] arr, int target) {
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
		// If the arr[start] == arr[mid] == arr[end]
		// increase start by 1, and decrease end by 1	
		if(arr[start] == arr[mid] && arr[mid] == arr[end]){
			return binarySearch(arr, target, start + 1, end - 1);
			}	
		// Search in first part
		else if(arr[start] <= arr[mid]) {
			if(target >= arr[start] && target <= arr[mid])
				return binarySearch(arr, target, start, mid - 1);
			else
				return binarySearch(arr, target, mid + 1, end);
			}
		// Search in second part	
		else if(target >= arr[mid] && target <= arr[end])
				return binarySearch(arr, target, mid + 1, end);
				
		return binarySearch(arr, target, start, mid - 1); 
	}
}
