package javaintprep;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {

	public static void main(String[] args) {
		int arr [] = {23,45,665,23};
		
		System.out.println(leaders(arr));

	}
		static ArrayList leaders(int arr[]) {
			int max = -1;
			ArrayList<Integer> ans=new ArrayList<>();
			
			for(int i=arr.length-1; i>=0; i--)
			{
				if(arr[i]>=max){

					ans.add(arr[i]);
					max=arr[i];
				}
			}
			Collections.reverse(ans);
			return (ans);
		}
	}


