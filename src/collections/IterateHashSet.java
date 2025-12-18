package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {
public static void main(String[] args) {
		
		HashSet<String> hashset = new HashSet<String>();
	
		
		hashset.add("bang");
		hashset.add("Pune");
		hashset.add("bomb");
		hashset.add("bhub");
		hashset.add("leh");
		hashset.add("del");
		

		System.out.println("using for Trerator");
		
		Iterator<String> it = hashset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("using for each loop");
		for(String j:hashset) {
			System.out.println(j);
		}
		
	}
}
