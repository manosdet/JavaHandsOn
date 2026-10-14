package javaintprep;

public class SeparateLatterNumbersAndSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello@123#World!";
		
		String str1 = str.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(str1);
		System.out.println(separateCharacter(str));

	}
	
	public static String separateCharacter(String str) {
		
		StringBuilder ch = new StringBuilder();
		StringBuilder lt = new StringBuilder();
		StringBuilder sc = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isLetter(c)) {
				lt.append(c);
			}else if(Character.isDigit(c)) {
				ch.append(c);
			}else {
				sc.append(c);
			}
		}
		
		return "Letters: " + lt.toString() + "\n" +
				"Numbers: " + ch.toString() + "\n" +
				"Special Characters: " + sc.toString();
		
	}

}
