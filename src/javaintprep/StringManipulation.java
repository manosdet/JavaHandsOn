package javaintprep;

public class StringManipulation {
public static void main(String [] args) {
	String str = "The rains have started here selenium";
	String str1 = "The rains Have started here selenium";
	System.out.println(str.length());
	System.out.println(str.charAt(5));
	System.out.println(str.indexOf('s'));// 1st occurrence of  latter s 
	System.out.println(str.indexOf('s', str.indexOf('s')+1));//2st occurrence of  latter s 
	System.out.println(str.indexOf('s', str.indexOf('s', str.indexOf('s')+1)+1));//3rd occurrence of  latter s 
	System.out.println(str.indexOf("have"));
	System.out.println(str.indexOf("hellow"));
	System.out.println();
	
	//String comparison:
	System.out.println(str.equals(str1));
	System.out.println(str.equalsIgnoreCase(str1));
	
	
	System.out.println(str.substring(0,3));
	
	
	String s= "    Hellow World";
	System.out.println(s.trim());
	
	
	System.out.println(s.replace(" ", ""));
	
	String date = "01-01-2025";
	System.out.println(date.replace("-","/"));
	
	
	String test = "Hello_World_Test_Selenium";
	String testval[] = test.split("_");
	for(int i =0; i< testval.length;i++) {
		System.out.println(testval[i]);
		
		
		
		String s2 = "cares";
		System.out.println(s2.concat("s"));
		
		String x= "Hello";
		String y = "World";
		int a=100;
		int b=200;
		
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
	}
}
}
