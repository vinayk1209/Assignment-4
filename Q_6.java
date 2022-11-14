
public class Q_6 {

	//WAP to implement Pangram Checking with least inbuilt methods being used.
	
	public static void main(String[] args) {
		
		String key = "John quickly extemporized five tow bags";
		boolean flag = true;
		
		//Removing spaces from string
		String newKey = ""; 
		for(int i=0; i<key.length(); i++) {
			if(key.charAt(i)!=' ') newKey+=key.charAt(i);
		}
		
		//toLowerCase
		String lowerKey = "";
		for(int i=0; i<newKey.length(); i++) {
			if(newKey.charAt(i) >= 'a' && newKey.charAt(i) <= 'z') lowerKey += newKey.charAt(i);
			if(newKey.charAt(i) >= 'A' && newKey.charAt(i) <= 'Z') lowerKey += (char)(newKey.charAt(i) + 32);
		}
		
		//checking for pangram
		int[] alph = new int[26];
		for(int i=0; i<lowerKey.length(); i++) {
			int index = lowerKey.charAt(i) - 'a';
			alph[index]++;
		}

		for(int i: alph) {
			if(i == 0) {
				System.out.println("String is not a Pangram");
				flag = false;
				break;
			}
		}
		
		if(flag) System.out.println("String is a panagram");
}

}