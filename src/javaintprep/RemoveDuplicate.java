package javaintprep;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		//Remove duplicate characters from a string preserving the order of characters eg "programming" => "progamin"
		System.out.println(removeDuplicate("programming"));
		
		
	}
	
	static String removeDuplicate(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(sb.indexOf(String.valueOf(ch))==-1) {
				sb.append(ch);
			}
		}
		return sb.toString();
	}

}
