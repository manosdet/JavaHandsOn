package java8streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {

	public static void main(String[] args) {
		ArrayList<Integer> numbersList = new ArrayList<Integer>();
		/*
		numbersList.add(10);
		numbersList.add(10);
		numbersList.add(10);
		numbersList.add(10);
		numbersList.add(10);
		*/
		
		List <Integer> numberList = Arrays.asList(10,15,20,30,35);
		
		List<Integer> evenNumbersList = new ArrayList<Integer>();
		
		/* without using streams
		
		for(int n: numberList) {
			if(n%2==0) {
				evenNumbersList.add(n);
			}
			System.out.println(evenNumbersList);
		}
		*/
		
		//Using strams
		
	//evenNumbersList =	numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
	//System.out.println(evenNumbersList);
		
		numberList.stream().filter(n->n%2==0).forEach(n->System.out.print(n+" "));//
		
		numberList.stream().filter(n->n%2==0).forEach(System.out::println);//

	}

}
