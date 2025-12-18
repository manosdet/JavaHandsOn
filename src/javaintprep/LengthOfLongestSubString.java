package javaintprep;

import java.util.HashMap;

public class LengthOfLongestSubString {

	
	public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int maxLength = 0;

        HashMap<Character,Integer> map= new HashMap<Character, Integer>();//{}

        for(int end = 0; end<s.length(); end++){
            char curr = s.charAt(end); //

            if(map.containsKey(curr)){
                start = Math.max(start ,map.get(curr)+1);
            }
            map.put(curr ,end);//ab=0; b=1; c=2;
            maxLength = Math.max(maxLength, end - start+1);

        }
        return maxLength;
    }
	
	
	
	public static void main(String[] args) {
		
		String input ="abcabcbb";
		int ml = lengthOfLongestSubstring(input);
		System.out.println(ml);
	}
}

