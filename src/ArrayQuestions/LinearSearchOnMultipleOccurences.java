package ArrayQuestions;

import java.util.ArrayList;

public class LinearSearchOnMultipleOccurences {

	public static void main(String[] args) {
		int[]arr = {1,2,2,3,3,4};
		int target = 3;
		// First way passing the arrayList as a parameter
		ArrayList<Integer> indices = helper(arr, new ArrayList<Integer>() , target , 0);
		System.out.println(indices);
		// Second way , I already initialize an arrayList inside MO method then create a helper class
		// and i pass the arrayList as a parameter
		System.out.println(MO(arr,target));
		
		// Third way, without passing the arrayList as an argument
		System.out.println(WithoutPassing(arr, target, 0));
	}
	
	static ArrayList<Integer> MO(int[] arr , int target){
		ArrayList<Integer> indices = new ArrayList<Integer>();
		return helper(arr, indices , target , 0);
	}
	
	static ArrayList<Integer> helper(int[] arr , ArrayList<Integer> indices , int target , int index){
		if(index == arr.length)
			return indices;
		if(arr[index] == target)
			indices.add(index);
		return helper(arr, indices, target, index + 1);
	}
	
	static ArrayList<Integer> WithoutPassing(int[] arr , int target , int index){
		ArrayList<Integer> indices = new ArrayList<Integer>();
		if(index == arr.length)
			return indices;
		if(arr[index] == target)
			indices.add(index);
		indices.addAll(WithoutPassing(arr, target, index + 1));
		return indices;
	}
}
