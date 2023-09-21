package String;

import java.util.ArrayList;
import java.util.List;

public class Iterative_Sub_Sequences {

	
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		List<List<Integer>> ans = subset(arr);
		for(List<Integer> list : ans) {
			System.out.print(list + " ");
		}
	}
	
	static List<List<Integer>> subset(int [] arr){
		List<List<Integer>> outer = new ArrayList();
		// Adding an empty element
		outer.add(new ArrayList());
		
		for(int num: arr) {
			int n = outer.size();
			for(int i = 0; i < n; i++) {
				List<Integer> internal = new ArrayList(outer.get(i));// Creating a copy from outer
				internal.add(num);
				outer.add(internal);
			}
		}
		return outer;
	}
}
