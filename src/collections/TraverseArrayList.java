package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TraverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(45);
		al.add(51);
		al.add(35);
		al.add(67);
		al.add(98);
		al.add(90);
		
		
		System.out.println("Traverse using for Loop");
		for(int counter=0; counter<al.size();counter++) {
			System.out.println(al.get(counter));
		}
		
		System.out.println("Traverse using for each Loop");
		for(Integer num:al) {
			System.out.println(num);
		}
		
		System.out.println("Traverse using while Loop");
		int count =0;
		while(al.size()>count) {
			System.out.println(al.get(count));
			count++;
		}
		
		System.out.println("Traverse using Iterator");
		Iterator<Integer> it = al.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}

	}

}
