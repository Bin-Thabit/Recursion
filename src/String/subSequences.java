package String;

public class subSequences {

	public static void main(String[] args) {
		String s = "abc";
		System.out.println("The subset of \"" + s +"\" are : ");
		subset("", s);
		
		
	}
	
	
	static void subset(String p, String up) {
		if(up.isEmpty()) {
			System.out.print(p + " ");
			return;
		}
			
		subset(p + up.charAt(0), up.substring(1));
		subset(p, up.substring(1));
	}
}
