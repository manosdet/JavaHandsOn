package JavaOOPs;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
	System.out.println(c.no_of_eyes);	
	c.eyesColor();
	
	Dog buzo = new Dog();
	buzo.eat();
	
	Parent p = new Parent();
	//p.childIsCrrying(); //We can not access child class propery

	}

}


class Parent{
	int no_of_eyes =2;
	
	void eyesColor()
	{
		//1000 lines of code 
		System.out.println("Eyes color is brown");
	}
}


class Child extends Parent
{
	
	void childIsCrrying() {
		
		System.out.println("Child always crrys");
	}
}



interface Animal{
	
	void eat();
	
}

class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("Dog is buzzo");
		
	}
	
}
