package java8streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	
	String sname;
	int sid;
	char grade;
	Student(String sname, int sid,char grade){
		this.sname=sname;
		this.sid=sid;
	    this.grade=grade;
	}
}
public class FlatMapDemo3 {

	public static void main(String[] args) {
		
		List<Student> studentList1 = new ArrayList<Student>();
		studentList1.add(new Student("Smit",101,'A'));
		studentList1.add(new Student("tom",102,'B'));
		studentList1.add(new Student("Nonu",103,'C'));
		
		
		List<Student> studentList2 = new ArrayList<Student>();
		studentList2.add(new Student("scout",104,'A'));
		studentList2.add(new Student("raghu",105,'B'));
		studentList2.add(new Student("Kituu",106,'C'));
		List<List<Student>> studentList = Arrays.asList(studentList1,studentList2);
		
		//Before java8
		for(List<Student> s:studentList) {
			for(Student stu:s) {
				System.out.println(stu.sname);
			}
		}
		
		//Using Flat Map 
	List<String> namesList = studentList.stream().flatMap(stulist->stulist.stream()).map(s->s.sname).collect(Collectors.toList());
	System.out.println(namesList);
		
	}

}
