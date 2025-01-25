package lambdaexpressions;
@FunctionalInterface
interface Cab{
	public void bookCab();
}

	
	
public class LambdaTestExmp1 {
	
public static void main(String [] args) {
	
	Cab cab=()-> System.out.println("Ola cab is booked...");
	cab.bookCab();
	

}
}
