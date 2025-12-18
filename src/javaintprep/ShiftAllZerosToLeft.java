package javaintprep;

import java.util.Arrays;

public class ShiftAllZerosToLeft {
	
	private static int[] shiftZeroToLeft(int [] a) {
		if (a.length == 1) {
            return a;
        }

        int lastindex = a.length-1;

        for (int i=a.length-1 ; i >=0; i--) {
            if (a[i] != 0) {
                a[lastindex] = a[i];
                lastindex--;
            }
        }

       
         for(int i =0;i<= lastindex; i++) {
        	 a[i]=0;
         }
         return a;
    }
		
		
	

	public static void main(String[] args) {
		
		int arr[] = {2,0,4,0,19,0,56,1,0,0};
		System.out.println(Arrays.toString(shiftZeroToLeft(arr)));
		
}
}
