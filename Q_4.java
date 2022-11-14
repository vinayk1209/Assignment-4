
public class Q_4 {

	//WAP to count the number of consonants, vowels, special characters in a String.
	
	public static void main(String[] args) {
		
		String key = "I am G. Vinay Kumar";
		
		int vowels = 0;
		int consonants = 0;
		int specialChar = 0;
		
		String lowerKey = key.toLowerCase();
		char[] keyChar = lowerKey.toCharArray();
		
		for(int i=0; i<lowerKey.length(); i++) {
			if(keyChar[i] >= 'a' && keyChar[i] <= 'z') {
				switch(keyChar[i]) {
				case 'a':
				case 'e':
				case 'i':
				case 'o': 
				case 'u':
					vowels++;
					break;
				default: consonants++;
				}
			} else specialChar++;
		}
		
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
		System.out.println("specialChar: " + specialChar);
	}

}
