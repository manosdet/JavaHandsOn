package javaintprep;

public class Swapping2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10, b=20;
		System.out.println("Before swapping values are.."+ a +" "+b);
		
		/*//Logic1 - Third variable
		
		int temp =a;
		
		a=b;
		b=temp;
		
		//Logic2 use + and - (Without using third variable)
		a=a+b;
		b=a-b;
		a=a-b;
		
		//Logic3 using * and / (Without using third variable)
		
		a=a*b;
		b=a/b;
		a=a/b;
		*/
		//Logic 4 - bitwise XOR(^)
		
		
		a=a^b;
		b=a^b;
		a=a^b;

		System.out.println("After swapping values are.."+ a +" "+b);
		
		//Logic5 - Single statement 
		b=a+b-(a=b);
		System.out.println("After swapping values are.."+ a +" "+b);
		a=a+b-(b=a);
		System.out.println("After swapping values are.."+ a +" "+b);
	}

}
