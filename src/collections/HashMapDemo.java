package collections;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[]args) {
		
		HashMap m = new HashMap();
		//HashMap<Integer,String> m = new HashMap<Integer,String>();
		m.put(101, "Jhon");
		m.put(102, "David");
		m.put(103, "Scott");
		m.put(104, "Mary");
		m.put(105, "tye");
		m.put(103, "X");
		m.put(106, "David");
		
		System.out.println(m);//{101=Jhon, 102=David, 103=Scott, 104=Mary, 105=tye}
		
		m.remove(106);
		System.out.println(m);
		System.out.println(m.containsKey(105));//true
		System.out.println(m.containsKey(165));//false
		System.out.println(m.containsValue("Jhon"));//true
		System.out.println(m.containsValue("dgt"));//false
		System.out.println(m.isEmpty());
		
		System.out.println(m.keySet());//return all the key as set 
		System.out.println(m.values());//return all the values as collection  |
		System.out.println(m.entrySet());//return all the entries  as set 
		
		
		
		
	}

}
