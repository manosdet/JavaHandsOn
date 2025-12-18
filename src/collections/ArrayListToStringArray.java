package collections;

import java.util.ArrayList;

public class ArrayListToStringArray {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
	
		
		al.add("bang");
		al.add("Pune");
		al.add("bomb");
		al.add("bhub");
		al.add("leh");
		al.add("del");
		
		String arr[] = new String[al.size()];
		
		for(int i=0;i<al.size();i++) {
			arr[i]=al.get(i);
		}
		
		for(String j:arr) {
			System.out.println(j);
		}
		System.out.println("using toArray");
		String arr1[] =al.toArray(new String[al.size()]);
		for(String j:arr1) {
			System.out.println(j);
		}
	}

}
