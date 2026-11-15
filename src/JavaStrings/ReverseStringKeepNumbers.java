package JavaStrings;

public class ReverseStringKeepNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseStringKeepDigits("Deloitte2026"));
	}
	
	public static String reverseStringKeepDigits(String str) {
		
		char[] arr = str.toCharArray();
		
		int left = 0;
		int right = str.length()-1;
		
		while(left < right) {
			
			//skip number from the left 
			while(left < right && !Character.isLetter(arr[left])){
				left++;
			}
			//skip number from the right 
			while(left < right && !Character.isLetter(arr[right])){
				right--;
			}
			if (left < right) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
            right--;
		}
		}
		
		return new String(arr);
		
	}

}
