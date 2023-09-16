package ArrayQuestions;

public class SortedArray {

	public static void main(String[] args) {
		int[] arr = {1,2,2,2};
		boolean ans = isSorted(arr, 0);
		System.out.println(ans);
	}
	
	static boolean isSorted(int [] arr, int point) {
		// Base Condition
		if(point == arr.length - 1)
			return true;
		else
			return arr[point] <= arr[point + 1] && isSorted(arr, point + 1);
	}
}
