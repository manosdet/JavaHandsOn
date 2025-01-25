package javaintprep;

public class FactorialNumber {
public static void main(String[] args) {
	
	int num =4;
	long factorial = 1;
	for(int i=num; i>= 1;i--) {
		
		factorial = factorial *i;
	}
	System.out.println("factoeial value of " + num + "is " + factorial);
	
	

}
}
