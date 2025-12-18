package javaintprep;

public class oddAndEven {

	public static void main(String[] args) {
		int arr [] = {1,2,0,4,5,6};
		for(int i= 0; i<arr.length ; i++) {

			if(arr[i]%2 == 0) {
				System.out.println("even number" + arr[i]);
			}
		}

		for(int i= 0; i<arr.length ; i++) {

			if(arr[i]%2 != 0) {
				System.out.println("odd number" + arr[i]);
			}
		}

		//using for each loop 
		for(int value:arr) {

			if(value % 2 ==0 ) {
				System.out.println("even numbers" + value);
			}else {
				System.out.println("odd number " + value);

			}
		}


	}

}
