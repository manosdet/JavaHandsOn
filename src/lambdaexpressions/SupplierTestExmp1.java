package lambdaexpressions;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierTestExmp1 {
	public static void main(String[] args) {
	
		Supplier<Date> s=()-> new Date();
		System.out.println(s.get());
	
	}
}
