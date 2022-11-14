
public class Q_3 {

	//WAP to check if “2552” is palindrome or not.
	
	public static void main(String[] args) {
		
		String key = "2552";
		String keyRev ="";
		
		String lowerKey = key.toLowerCase();
		
		for(int i=lowerKey.length()-1; i>=0; i--) {
			keyRev+=lowerKey.charAt(i);
		}
		
		boolean compare = lowerKey.contentEquals(keyRev);
		
		if(compare) System.out.println(key + " is palindrome");
		else System.out.println(key + " is not palindrome");
	}

}
