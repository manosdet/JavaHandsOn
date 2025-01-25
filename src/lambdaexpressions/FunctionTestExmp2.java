package lambdaexpressions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee1{
	String ename;
	int salary ;
	int experience;
	Employee1(String name,int sal){
		this.ename=name;
		this.salary=sal;
	}
}
public class FunctionTestExmp2 {
public static void main(String []args) {
	ArrayList<Employee1> emplist = new ArrayList<Employee1>();
	
	emplist.add(new Employee1("david" ,50000));
	emplist.add(new Employee1("juned" ,67505));
	emplist.add(new Employee1("ravi" ,38760));
	emplist.add(new Employee1("prem" ,5800));
	Function<Employee1,Integer> fn=e->{ int sal =e.salary;
	if(sal>=10000 && sal<=20000)
		return (sal*10/100);
	else if(sal>=20000 && sal<=30000)
		return (sal*20/100);
	else if(sal>=30000 && sal<=40000)
		return (sal*30/100);
	else 
		return(sal*40/100);
	};
	
	
	Predicate<Integer> p=b->b>5000;
	for(Employee1 emp: emplist) {
		
		int bonus =fn.apply(emp); //Function
		
	if(	p.test(bonus)); //Predicate
		System.out.println(emp.ename+"  "+emp.salary +"available bounus is "+ bonus);
	}
	
}
}
