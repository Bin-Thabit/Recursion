package String;

import java.util.ArrayList;

public class Permutations {

	public static void main(String[] args) {
		permutation1("", "abc");
		System.out.println(permutation2("", "abc"));
		System.out.println(permutation3("", "abc"));
		System.out.println(permutation4("", "abc",0));
	}
	
	// print the permutations Solution 1
	static void permutation1(String p , String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch = up.charAt(0);
		for(int i = 0; i < p.length() + 1; i++) {
			String f = p.substring(0, i);
			String s = p.substring(i, p.length());
			permutation1(f + ch + s , up.substring(1));
		}
			
	}
	
	// Return an arrayList Solution 2
	static ArrayList<String> permutation2(String p , String up) {
		if(up.isEmpty()) {
			ArrayList<String> per = new ArrayList<String>();
			per.add(p);
			return per;
		}
		ArrayList<String> ans = new ArrayList<String>();
		char ch = up.charAt(0);
		for(int i = 0; i < p.length() + 1; i++) {
			String f = p.substring(0, i);
			String s = p.substring(i, p.length());
			ans.addAll(permutation2(f + ch + s , up.substring(1)));
		}
		return ans;	
	}
	
	// Return Number of permutation solution 3
	static int permutation3(String p , String up ) {
		if(up.isEmpty()) {
			return 1;
		}
		int count = 0;
		char ch = up.charAt(0);
		for(int i = 0; i <= p.length() ; i++) {
			String f = p.substring(0, i);
			String s = p.substring(i, p.length());
			count +=  permutation3(f + ch + s , up.substring(1));
		}
		return count ;
	}
	
	// Return Number of permutation solution 4
	static int permutation4(String p , String up , int count) {
		if(up.isEmpty()) {
			return count + 1;
		}
		char ch = up.charAt(0);
		for(int i = 0; i <= p.length() ; i++) {
			String f = p.substring(0, i);
			String s = p.substring(i, p.length());
			count = permutation4(f + ch + s , up.substring(1), count);
			
		}
		return count;
	}
}
