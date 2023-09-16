package ArrayQuestions;

public class SearchRotated {

	public static void main(String[] args) {
		int[] arr = {7,8,9,1,2,3,4};
		int target = 7;
		int ans = bin(arr, target, 0, arr.length - 1);
		System.out.println(ans);
	}
	
	static int bin(int[] arr, int target, int start, int end) {
		if(start > end)
			return -1;
		int mid = start + (end - start) / 2;
		if(arr[mid] == target)
			return mid;
		else if(arr[start] <= arr[mid]) {
			if(target >= arr[start] && target <= arr[mid])
				return bin(arr, target, start, mid - 1);
			else
				return bin(arr, target, mid + 1, end);
		}
		else if(target >= arr[mid] && target <= arr[end])
			return bin(arr, target, mid + 1, end);
		
		return bin(arr, target, start, mid - 1); 
	}
}
