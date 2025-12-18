package javaintprep;

public class CountVovelConsonants {

	public static void main(String[] args) {
		int vCount=0,cCount=0;
		String str= "Auto-generated method stub";
		str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='a' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='e') {
				vCount++;
			}else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				System.out.println(str.charAt(i));
				cCount++;
			}
			
			
		}
		System.out.println(vCount);
		System.out.println(cCount);
	}

}
