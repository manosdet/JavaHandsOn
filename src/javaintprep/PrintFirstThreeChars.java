package javaintprep;

public class PrintFirstThreeChars {
	 public static void main(String[] args) {
	        String str = "Hello World";
	        String whitespace =  str.replaceAll("\\s", "");
	      System.out.println(  str.contains(whitespace));
            System.out.println(whitespace);
	        if (str.length() >= 3) {
	            String firstThreeChars = str.substring(0, 3);
	           
	            System.out.println(firstThreeChars);
	        } else {
	            System.out.println("String is too short!");
	        }
	    }
}
