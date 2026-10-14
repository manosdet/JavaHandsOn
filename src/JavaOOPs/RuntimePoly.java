package JavaOOPs;

public class RuntimePoly {

	public static void main(String[] args) {
		A1 a = new B1();
		
		a.m1();
		// TODO Auto-generated method stub

	}

}

class A1{
	
	void m1() {
		System.out.println("m1() method in class B");
	}
}


class B1 extends A1{
	
	
	@Override
	void m1() {
		
		System.out.println("m1() method in class b");
	}
}