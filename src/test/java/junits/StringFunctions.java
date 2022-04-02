package junits;

public class StringFunctions {
	
	//String str = "madam";

	public static boolean isPalindrome(String str) {
		
		int start = 0;
		int last = str.length() - 1;
		
		while (start < last) {
			
			if (str.charAt(start) != str.charAt(last)) {
				
				return false;
			}
			
			start++;
			last--;
		}
		
		return true;
	}

/*
	public static boolean isPalindrome1(String str) {
		
		for (int i = 0; i < str.length(); i++) {
			
			String rev = "";
			
			rev = rev + str.charAt(str.length() - 1);
			
			if (str != rev) {
				
				return false;
			}
			
		}
		
		return true;
	}
*/
	
}
