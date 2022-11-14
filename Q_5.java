import java.util.Arrays;

public class Q_5 {

	//WAP to implement Anagram Checking least inbuilt methods being used.
	
	static String toLower(String str) {
		String lowerKey = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') lowerKey += str.charAt(i);
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') lowerKey += (char)(str.charAt(i) + 32);
		}
		return lowerKey;
	}
	
	static void sort(char[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length-i; j++) {
				if(arr[j-1] > arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = (char) temp;
				}
			}
		}
	}
	
	static boolean compareArray(char[] ar1, char[] ar2) {
		boolean flag = true;
		if(ar1.length == ar2.length) {
			for(int i=0; i<ar1.length; i++) {
				if(ar1[i] == ar2[i]);
				else {
					flag = false;
					break;
				}
			}
		} else flag = false;
		return flag;
	}
	
	public static void main(String[] args) {
		
		String s1 = "Pot";
		String s2 = "Top";
		
		String s1Lower = toLower(s1);
		String s2Lower = toLower(s2);
		
		char[] s1Char = s1Lower.toCharArray();
		char[] s2Char = s2Lower.toCharArray();
	
		sort(s1Char);
		sort(s2Char);
		
		boolean compare = compareArray(s1Char, s2Char);
		
		if(compare) System.out.println("String is anagram");
		else System.out.println("String is not anagram");
	}

}
