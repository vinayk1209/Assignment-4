
public class Q_1 {

	//WAP to remove Duplicates from a String.(Take any String ex with duplicates character)
	
	public static void main(String[] args) {
		
		String key = "Perpendicular";
		String noDup = "";
		
		String keyLower = key.toLowerCase();
		
		char[] keyCharArr = keyLower.toCharArray();
		int[] alph = new int[26];
		int[] keyA = new int[key.length()];
		
		for(int i=0; i<keyCharArr.length; i++) {
			int index = keyCharArr[i] - 'a';
			if(alph[index] == 1) keyA[i] = 1;
			else alph[index]++;
		}
		
		for(int i=0; i<keyA.length; i++) {
			if(keyA[i]!=1) noDup+=keyCharArr[i];
		}
		
		System.out.println(noDup);
		
		/* 	other approach
		 
		 static String dupRemover(char[] arr) {
		String newStr = "";
		for(int i=0; i< arr.length; i++) {
			if(i==0) newStr += arr[i];
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					break;
				} else if(j==(i-1)) {
					newStr+=arr[i];
				}
			}
		}
		
		return newStr;
	}

	public static void main(String[] args) {
		
		char[] name = "perpendicular".toCharArray(); 
		System.out.println(dupRemover(name));
	}

	 */
	}

}
