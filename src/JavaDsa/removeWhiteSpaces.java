package JavaDsa;

public class removeWhiteSpaces {
public static void main(String [] args) {
	String str = " can you reme white spaces from string ";
	
	str = str.replaceAll("\\s+" , "");
	System.out.println(str);
}
}
