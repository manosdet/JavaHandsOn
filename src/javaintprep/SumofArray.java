package javaintprep;

public class SumofArray {
public static void main(String [] args) {
	
	int arr[] = {1,4,6,7,89,8};
	int sum = 0;
	for(int i=0;i<arr.length-1;i++) {
		sum = sum +arr[i];
	}
	System.out.println("sum of array is "+ sum );
}
}
