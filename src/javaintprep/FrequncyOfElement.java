package javaintprep;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// Find the frequency of each element in Array using Map
public class FrequncyOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10,5,15,14,23,45,5};
		int l = arr.length;
		
		frequency(arr,l);
		
	}
	
	static void frequency(int arr[],int l) {
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<l;i++){
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], i);
			}
		}
		
		for(Entry<Integer, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey() + "   "+entry.getValue());
			}
		
	}

}
