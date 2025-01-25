package javaintprep;

public class EvenoddfromArray {
	public static void main(String [] args) {
		
		int arr[] = {1,4,6,7,89,8};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 == 0) {
				System.out.println("even numbers are" + arr[i]);
			}}
		
			for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 != 0) {
				System.out.println("odd numbers are" + arr[i]);
			}
		}
			
			
			//Enhanced for loop 
			
			
			for(int value :arr) {
				if(value%2 == 0) {
					System.out.println("even numbers are" + value);
				}else{
					
					System.out.println("odd numbers are" + value);
				}
				}
				
			
			}
		
	}

