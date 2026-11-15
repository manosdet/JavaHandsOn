package JavaStrings;
//Revision On 15 th Nov- it should b e done 
public class ReverseVowels {

	public static void main(String[] args) {
		System.out.println(reverseVowel("automation"));

	}
	
	public static String  reverseVowel(String str) {
		char[] arr = str.toCharArray();
		
		
		int left =0;
		int right = arr.length - 1;
		
		while(left < right) {
			
			//Move left pointer until it finds a vowel
			while(left < right && !isVowel(arr[left])) {
				left ++;
			}
			
			//Move right pointer until it finds a vowel
			while(left < right && !isVowel(arr[right])) {
				right --;
			}
			
			//Swap the vowels
			
			char temp = arr[left];
			 arr[left] = arr[right];
			 arr[right] = temp;
			 left++;
			 right--;
			 
		}
		
		
		return new String(arr);
		
	}
	
	static boolean isVowel(char ch) {
	    return "aeiouAEIOU".indexOf(ch) != -1;
	  
	}

}
