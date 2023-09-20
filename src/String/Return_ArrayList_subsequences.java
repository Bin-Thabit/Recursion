package String;

import java.util.ArrayList;

public class Return_ArrayList_subsequences {

	public static void main(String[] args) {
		System.out.println(subset1("", "abc"));
		System.out.println(subset2("", "abc"));
		
	}
	
	// Solution 1 
	static ArrayList<String> subset1(String p, String up) {
		
		if(up.isEmpty()) {
			ArrayList<String> list = new ArrayList();
			list.add(p);
			return list;
		}
		
		ArrayList<String> left = subset1(p + up.charAt(0), up.substring(1));	
		ArrayList<String> right = subset1(p, up.substring(1));
		
		left.addAll(right);
		return left;
	}
	
	// Solution 2
	static ArrayList<String> subset2(String p , String up){
		ArrayList<String> subset = new ArrayList();
		return helper(p , up, subset);
	}
	
	static ArrayList<String> helper(String p, String up , ArrayList<String> subset) {
		
		if(up.isEmpty()) {
			subset.add(p);
			return subset;
		}
		
		subset =  helper(p + up.charAt(0), up.substring(1) , subset);	
		subset =  helper(p,  up.substring(1) , subset);
		
		return subset;
	}
}
