package JavaStrings;

public class StrEquals {
	
	
	

	public static void main(String[] args) {
		String str1 = new String("Jaddu");
		String str2 = new String("Jaddu");
		
		String str3 = "Jaddu";
		String str4 = "Jaddu";
		
		System.out.println(str1==str2);
		System.out.println(str3==str4);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str3.equals(str4));

	}
	
	
	
	
	


}
