package String;

public class Skip_a_String {

	public static void main(String[] args) {
		System.out.println(skipApple1("sapplestr")); // sstr
		skipApple2("" ,"sapplestr" );// sstr
		StringBuilder up = new StringBuilder();
		System.out.println(skipApple3(up,"sapplestr" ));// sstr
	}
	
	// Solution 1
	static String skipApple1(String up) {
		if(up.isEmpty())
			return "";
		if(up.startsWith("apple"))
			return skipApple1(up.substring(5));
		else
			return up.charAt(0) + skipApple1(up.substring(1));
	}
	
	// Solution 2
	static void skipApple2(String p , String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		if(up.startsWith("apple"))
			skipApple2(p, up.substring(5));
		else
			skipApple2(p + up.charAt(0), up.substring(1));
	}
	// Solution 3
	static String skipApple3(StringBuilder p , String up) {
		if(up.isEmpty()) {
			return p.toString();
		}
		
		if(up.startsWith("apple"))
			return skipApple3(p, up.substring(5));
		else
			return skipApple3(p.append(up.charAt(0)), up.substring(1));
	}
}
