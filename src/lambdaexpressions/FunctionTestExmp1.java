package lambdaexpressions;

import java.util.function.Function;

public class FunctionTestExmp1 {

	public static void main(String[] args) {
		//squre
		Function<Integer,Integer> f=n->n*n;
		System.out.println(f.apply(5));
		//String length
		
		Function<String , Integer> fn=s->s.length();
		
		System.out.println(fn.apply("Rajivee"));

	}

}
