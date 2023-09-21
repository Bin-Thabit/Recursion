package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSequences_with_duplicate_elements {

	public static void main(String[] args) {
		int[] arr = {1,2,2};
		List<List<Integer>> ans = subset(arr);
		for(List<Integer> list : ans) {
			System.out.print(list + " ");
		}
	}
	
	static List<List<Integer>> subset(int [] arr){
		// Sort the array
		Arrays.sort(arr);
		List<List<Integer>> outer = new ArrayList();
		// Adding an empty list
		outer.add(new ArrayList());
		
		int start = 0;
		int end = 0;
		for(int i = 0; i < arr.length; i++) {
			start = 0;
			// Check if the element is equal to the previous element
			if(i > 0 && arr[i] == arr[i-1])
				start = end + 1;
			end = outer.size() - 1;
			int n = outer.size();
			for(int j = start; j < n; j++) {
				List<Integer> internal = new ArrayList(outer.get(j));// Creating a copy from outer
				internal.add(arr[i]);
				outer.add(internal);
			}
		}
		return outer;
	}
}
