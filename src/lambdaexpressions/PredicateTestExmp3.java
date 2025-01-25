package lambdaexpressions;

import java.util.function.Predicate;

//Joining Predicates - and ,or , negate
//p1 -- checks number is even
//p2-- checks greater than 50

public class PredicateTestExmp3 {
	public static void main(String[] args) { 
	int a[] = {5,15,20,25,30,35,24,40,45,50,55,60,65};
	
	Predicate<Integer> p1= i->i%2==0;
	Predicate<Integer> p2= i->i>50;
	
	//and 
	System.out.println("Following are numbers Even and greater than 50");
	for(int  ele :a) {
		
	//	if(p1.test(ele) && p2.test(ele))

		if(p1.and(p2).test(ele)){
			System.out.println(ele);
		}
	}
	//or
	System.out.println("Following are numbers Even OR greater than 50");
	for(int  ele :a) {

			if(p1.or(p2).test(ele)){
				System.out.println(ele);
			}
		}
	
	//negate
		System.out.println("Following are numbers odd numbers used nagate");
		for(int  ele :a) {

				if(p1.negate().test(ele)){
					System.out.println(ele);
				}
			}
	}
}
