package lambdaexpressions;

import java.util.function.Predicate;

public class PredicateTestExmp1 {
public static void main(String[] args) { 
	
	//EX1.
	Predicate<Integer> p = i->(i>10);
	System.out.println(p.test(20));
	
	
	//EX: check the length of given string is greater than 4 or not 
Predicate<String> pr =s->(s.length()>4);
   System.out.println(  pr.test("Wme"));
   
   //Ex4. Print array elements whose size is > 4 from array
   String names[] = {"David", "Scoot" , "Smith","Jhon","MArry"};
   
   for(String name:names) {
	   if(pr.test(name)) {
		   {
			   System.out.println(name);
		   }
	   }
   }
}
}
