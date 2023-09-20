package String;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsequences_with_ASCII_Values {

	public static void main(String[] args) {
		System.out.println(subseqAscii1("", "ab")); // [ab, a, a98, b,  , 98, 97b, 97, 9798]
		System.out.println(subseqAscii2("", "ab")); // [ab, a, a98, b,  , 98, 97b, 97, 9798]
	}
	
	// Solution 1
	static ArrayList<String> subseqAscii1(String p , String up){
		if(up.isEmpty()) {
			return new ArrayList(Arrays.asList(p));
		}
		char ch = up.charAt(0);
		ArrayList<String> left =  subseqAscii1(p + ch , up.substring(1));
		ArrayList<String> mid =   subseqAscii1(p , up.substring(1));
		ArrayList<String> right = subseqAscii1(p + (int)(ch) , up.substring(1));
		
		
		left.addAll(mid);
		left.addAll(right);
		return left;
	}
	
	// Solution 2
	static ArrayList<String> subseqAscii2(String p , String up){
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
		subset =  helper(p + (int)up.charAt(0), up.substring(1) , subset);
			
		return subset;
	}
}
