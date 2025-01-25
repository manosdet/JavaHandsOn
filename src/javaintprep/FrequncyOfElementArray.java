package javaintprep;

public class FrequncyOfElementArray {

	// Find the frequency of each element in Array 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10,5,15,14,23,45,5};
		int l = arr.length;

		Countfrequency(arr,l);

	}

	public static void Countfrequency(int arr[],int l) {
		boolean visited[] = new boolean[l];

		for(int i=0; i<l;i++) {
			//Skip this element if already processed

			if(visited[i] == true) 
				continue;
			//count frequency

			int count = 1;
			for(int j= i+1; j<l;j++) {
				if(arr[i]==arr[j]) {
					visited[j] = true;
					count ++;
				}
			}
			System.out.println(arr[i]+" "+count);


		}

	}

}
