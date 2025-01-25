package javaintprep;

import java.util.Random;

public class GenerateRandomNumberAndStrings {

	public static void main(String[] args) {
	//Aproch 1-random
		Random rand = new Random();
		
	int rand_int =	rand.nextInt(1000);
	System.out.println(rand_int);
	
	
   double   rand_dub =	rand.nextDouble();
   System.out.println(rand_dub);
		
   
   //Approache 2-Math
   
   System.out.println(Math.random());
   
   
   //Apprpache 3-- Using Appache commons lang 
	}

}
