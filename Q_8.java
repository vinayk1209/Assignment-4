import java.util.Arrays;

public class Q_8 {

	//WAP to find the maximum occurring character in a String.
	
	public static void main(String[] args) {
		
		String key = "Assignments";
		
		String lowerKey = key.toLowerCase();
		char[] keyChar = lowerKey.toCharArray();
		
		int[] alp = new int[26];
		
		for(int i=0; i<keyChar.length; i++) {
			int index = keyChar[i] - 97;
			alp[index]++;
		}
		
		int max = 0;
		for(int i=0; i<alp.length; i++) {
			if(alp[i]> max) {
				max = alp[i];
			}
		}
			
		int maxIndex = 0;
		for(int i=0; i< alp.length; i++) {
			if(max == alp[i]) maxIndex = i;
		}

		char mostOcChar = (char)(maxIndex+97);
		System.out.println("Maximum occuring character is: ");
		System.out.println(mostOcChar);
	}

}
