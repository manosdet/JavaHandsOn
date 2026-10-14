package javaintprep;

public class CountOfLastElementOfString {

	public static void main(String[] args) {
		System.out.println(getCountOfLastElementOfString("Im preparing for twinty Lakhu"));

	}
	
	public static int getCountOfLastElementOfString(String str) {
		
		str = str.trim();
		int count = 0;
		int countMax = 0;
		for(int i=str.length()-1; i>0; i--) {
			if(str.charAt(i) == ' ') {
				countMax = (count > countMax) ? count : countMax;
				//count = 0;
				break;
			}
			else {
				  count++; 
			}
			
		}
		return countMax;
		
		
	}

}
