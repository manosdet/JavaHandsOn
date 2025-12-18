package java8streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		List<Integer> multipliedList = new ArrayList<Integer>();
		
		
		//without stream
		
		for(int num:numbers) {
			
			multipliedList.add(num*3);
		}
		System.out.println(multipliedList);
		
		
		
		 multipliedList =	numbers.stream().map(num->num*3).collect(Collectors.toList());
		 System.out.println( multipliedList);
		 
		 numbers.stream().map(num->num*3).forEach(num-> System.out.println(num));
		 numbers.stream().map(num->num*3).forEach(System.out::println);
		
		
	}
}
