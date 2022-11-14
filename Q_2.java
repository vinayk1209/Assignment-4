
public class Q_2 {

	//WAP to print Duplicates characters from the String.
	
	public static void main(String[] args) {
		String key = "Assignments";
		
		
		char[] keyArr = key.toLowerCase().toCharArray();
		
		int[] alp = new int[26];
		
		for(int i=0; i<keyArr.length; i++) {
			int index = (keyArr[i]) - 97;
			alp[index]++;
		}
		
		System.out.println("Duplicates: ");
		for(int i=0; i<alp.length; i++) {
			if(alp[i] >= 2) {
				char ch = (char)(i+97);
				System.out.print(ch + ", ");
			}
		}
	}

}
