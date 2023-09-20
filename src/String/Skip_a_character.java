package String;

public class Skip_a_character {

	
	public static void main(String[] args) {
	
		System.out.println(skip1("", "baccad" ));
		StringBuilder s = new StringBuilder();
		skip2(s, "baccad");
		System.out.println(skip3("baccad"));
		String a = "applqu";
		
	}
	
	// Solution 1
	static String skip1(String p , String up ) {
		if(up.isEmpty()) 
			return p;
		
		
		char check = up.charAt(0);
		if(check == 'a') 
			return skip1(p , up.substring(1));
		else
			return skip1(p + check , up.substring(1));
			
	}
	
	// // Solution 2
	static void skip2(StringBuilder p , String up ) {
		if(up.isEmpty()) {
			System.out.println(p);
			return ;
		}
		
		char check = up.charAt(0);
		if(check == 'a') 
			skip2(p , up.substring(1));
		else
			skip2(p.append(check)  , up.substring(1));
			
	}
	
	// Solution 3
	static String skip3(String up) {
		if(up.isEmpty()) {
			return "";
		}
		
		char check = up.charAt(0);
		if(check == 'a') 
			return "" + skip3(up.substring(1));
		else
			return check + skip3(up.substring(1));
			
	}

}
