package lambdaexpressions;
@FunctionalInterface
interface CabBook{
	public void bookCab(String source, String destination);
}

	
	
public class LambdaTestExmp2 {
	
public static void main(String [] args) {
	
	CabBook cab=(String source, String destination)-> System.out.println("Ola cab is booked from " + source + "   to " +destination + "...");
	cab.bookCab("hyd","bom");
	

}
}
