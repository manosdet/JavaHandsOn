package lambdaexpressions;
interface CabPrice{
	public String bookCab(String source, String destination);
}
	
	
public class LambdaTestExmp3 {
	
public static void main(String [] args) {
	
	CabPrice cab=(String source, String destination)->{ System.out.println("Ola cab is booked from " + source + "   to " +destination + "...");
	return ("Price: 5000 Rs");
	};
System.out.println(cab.bookCab("hyd","bom"));
	

}
}

