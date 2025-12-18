package javaintprep;

import java.util.Arrays;

public class ShiftZeroToRight {
	
	private static int[] shiftZeroToRight(int [] a) {
		
		if(a.length ==1) {
			return a;
		}
		
		int newArray[]= new int[a.length];
		int count = 0;
		for(int number :a) {
			if(number != 0) {
				newArray[count] =  number;
				count++;
			}
		}
		return newArray;
		
	}

	public static void main(String [] args) {
		
		int[] i = new int[] {1,2,4,0,3,0,4,0,0,0};
		int[] p = new int[] {0,1,0,3,12};
		
		
	System.out.println(Arrays.toString(	shiftZeroToRight(p)));
		Arrays.sort(p);
	}
}
