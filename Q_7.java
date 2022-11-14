
public class Q_7 {

	//WAP to find if String contains all unique characters.
	
	public static void main(String[] args) {
		
		String key = "Palindrome";
		
		String lowerKey = key.toLowerCase();
		char[] keyChar = lowerKey.toCharArray();
		
		boolean flag = true;

		int[] alp = new int[26];
		
		for(int i=0; i<keyChar.length; i++) {
			int index = keyChar[i] - 97;
			alp[index]++;
		}
		
		for(int i: alp) {
			if(i > 1) {
				flag = false;
				System.out.println("All Characters in " + key + " are not unique");
				break;
			}
		}
		
		if(flag) System.out.println("All Characters in " + key + " are unique");
	}

}
