package javaintprep;

public class secondLargestAndSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {5,6,8,1,2,3,10,5,6,7};
secondLargest(arr);
secondSmallest(arr);
largestNumber(arr);
	}

	private static void secondLargest(int[] arr) {
		int temp = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j =i+1; j<arr.length;j++) {
				if(arr[i] >arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		
		System.out.println("second smallest number" + arr[1]);
	}

	private static void secondSmallest(int[] arr) {
		int temp = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j =i+1; j<arr.length;j++) {
				if(arr[i] <arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
		System.out.println("second largest number" + arr[1]);
	}
	
	private static void largestNumber(int[] arr) {
		int largest = Integer.MIN_VALUE;
		int second_largest = Integer.MIN_VALUE;
		
		for(int i = 0; i<arr.length ; i++) {
			if(arr[i]>largest) {
				second_largest = largest;
				largest = arr[i];
			}else if(arr[i] > second_largest && arr[i]!= largest) {
				second_largest = arr[i];
				
			}
		}
		System.out.println(second_largest);
	}

}
