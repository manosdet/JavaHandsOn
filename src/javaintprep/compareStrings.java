package javaintprep;

public class compareStrings {

	public static void main(String[] args) {
		
		String str1 = "you are the jon";
		String str2 = "you will not become don";
		String str3 = "You are the Jon";
		
		if(str1.equals(str2)) {
			System.out.println("Give stringa are equals");
		}else {
			System.out.println("given string are not equals");
		}
		
		
		if(str1.equalsIgnoreCase(str3)) {
			System.out.println("Give stringa are equals");
		}else {
			System.out.println("given string are not equals");
		}
	}

}
