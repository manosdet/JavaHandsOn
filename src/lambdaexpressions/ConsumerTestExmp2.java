package lambdaexpressions;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee2{
	String ename;
	int salary ;
	String gender;
	
	Employee2(String name,int salary,String gender){
		this.ename=name;
		this.salary=salary;
		this.gender= gender;
	}
}
public class ConsumerTestExmp2 {
	
	public static void main(String []args) {
		ArrayList<Employee2> emplist = new ArrayList<Employee2>();
		
		emplist.add(new Employee2("david" ,50000,"male"));
		emplist.add(new Employee2("shyam" ,67505,"Male"));
		emplist.add(new Employee2("ravi" ,38760,"Male"));
		emplist.add(new Employee2("prem" ,58007,"Male"));
		emplist.add(new Employee2("sandhya" ,58007,"female"));
		
		//function
		Function<Employee2,Integer> fn=emp->(emp.salary*10)/100;//task1
		
		//Predicate
		Predicate<Integer> p=b->b>=1000;//task2
		//Consumer
		
		Consumer <Employee2> c=emp->{
			System.out.println(emp.ename);
			System.out.println(emp.salary);
			System.out.println(emp.gender);
		};//task3
		
		for(Employee2 e:emplist) {
			int bonus = fn.apply(e);//calculate bonus invoked function
			if(p.test(bonus))//Invoked predicate
			{
				c.accept(e);//invoked consumer
				System.out.println("Empolyee bonus.."+ bonus);
			}
		}
	}
}
