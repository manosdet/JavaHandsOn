package javaintprep;

public class StringPallindrome {
public static void main (String [] args) {
	
	String str = "nooloon";
	
	isPalindromeString(str);
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
}
