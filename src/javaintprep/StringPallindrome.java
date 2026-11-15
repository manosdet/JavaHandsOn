package javaintprep;

public class StringPallindrome {
public static void main (String [] args) {
	
	String str = "nooloon";
	
	//isPalindromeString(str);
	System.out.println(isStringPalindrome(str));
	System.out.println(isStringPalindromeO(str));
}

static void isPalindromeString(String str){ 
	
	String org_str = str;
	String rev="";
	int len = str.length();
	for(int i=len-1;i>=0; i--) {
		rev = rev + str.charAt(i);
	}
	System.out.println(rev);
	System.out.println(str);
	
	if(org_str == rev) {
		System.out.println("given string "+ str + " is palindrome" );
	}
	else {
		System.out.println(str +" is not pallindrome");
	}
}


public static boolean isStringPalindrome(String str) {  
	
	char[] arr = str.toCharArray();
	boolean falg = true;
	int left = 0;
	int right = arr.length-1;
	
	while(left < right) {
		
		if(arr[left] != arr[right]){
			return falg = false;
			
		}else {
			left++;
			right--;
		}
		
	}
	return falg;
}

//optimize with time O(1) 
public static boolean isStringPalindromeO(String str) {
    int left = 0;
    int right = str.length() - 1;

    while (left < right) {
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}

}
