package javaintprep;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reversenumber(26749));
		System.out.println(reverseNumberUsingStringBuffer(26749));

		System.out.println(reverseNumberUsingStringBuilder(26749));
	}
	//using algorithm
	public static int reversenumber(int number) {
		
		int rev = 0;
		
		while(number!=0) {
			rev=rev*10 + number%10;
			number=number/10;
		}
		
		return rev;
		
	}
	
	public static StringBuffer reverseNumberUsingStringBuffer(int num) {
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev =sb.reverse();
		return rev;
	}
	public static StringBuilder reverseNumberUsingStringBuilder(int num) {
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
	    StringBuilder rev = sbl.reverse();
	    return rev;
		
	}
	

}
