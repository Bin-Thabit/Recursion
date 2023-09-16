package ArrayQuestions;

public class LinearSearch {

	public static void main(String[] args) {
		int [] arr = {3,2,1,18,9};
		int target = 1;
		int ansInIndexFromFirst = LS1(arr, target, 0);
		int ansInIndexFromLast = LS2(arr, target, arr.length - 1);
		boolean ansInBoolean = LS3(arr, target, 0);
		System.out.println("Answer in index from the first = " +ansInIndexFromFirst);
		System.out.println("Answer in index from the last = " +ansInIndexFromLast);
		System.out.println("Answer in Boolean = " +ansInBoolean);
	}
	
	// Return index value from the first
	static int LS1(int[] arr, int target, int index) {
		// Base Condition
		if(index == arr.length)
			return -1;
		if(arr[index] == target)
			return index;
		return LS1(arr, target, index + 1);
	}
	
	// Return index value from the last
		static int LS2(int[] arr, int target, int index) {
			// Base Condition
			if(index == -1)
				return -1;
			if(arr[index] == target)
				return index;
			return LS2(arr, target, index - 1);
		}
	
	// Return boolean value
		static boolean LS3(int[] arr, int target, int index) {
			// Base Condition
			if(index == arr.length)
				return false;
			return arr[index] == target ||LS3(arr, target, index + 1);
		}
}
