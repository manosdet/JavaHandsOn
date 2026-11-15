package map;

public class CharacterFrequency {

	public static void main(String[] args) {
		String str = "Deloitte2026";
        System.out.println("Input String: " + str);
        System.out.println("\nCharacter Frequencies:");
        printCharFrequency(str);

	}
	
	
	public static void printCharFrequency(String str) {
		
		//Create an integer array to store counts for all 256 ASCII characters
		int[] frequency = new int[256];
		
		
		//Step 1: Count occurrences of each character
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			frequency[ch]++;//Increament the count at the character's ASCII index
		}
		
		//Step 2: Print the frequency in the order they appear in the string
		for(int i=0; i<str.length();i++) {
		char ch = str.charAt(i);
		
		//Check if the character has already been printed 
		if(frequency[ch] !=0) {
			System.out.println("'"+ ch + "' : " + frequency[ch]);
			
			//Set frequency to 0 so we don't print duplicates 
			frequency[ch] = 0;
		}
		
		}
	}

}
