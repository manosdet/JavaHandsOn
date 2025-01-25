package javaintprep;
//How to Remove Special Characters from String in Java
public class RemoveSpecialCharatcerFromString {
	
	public static void main (String []args) {
		String check="J@13a5&v4%a87";
		
		System.out.println(check.replaceAll("[^a-zA-Z0-9]", ""));
		
	}

}
