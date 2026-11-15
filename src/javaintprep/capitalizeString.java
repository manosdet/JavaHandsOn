package javaintprep;

public class capitalizeString {

	public static void main(String[] args) {
		String caps = capitalizeWors("join new org");
		System.out.println(caps);
	}

	private static String capitalizeWors(String str) {
		String words[] = str.split("\\s");
		String result = "";
		for(String w : words) {
			String first = w.substring(0, 1).toUpperCase();
			System.out.println(first);
			String restString = w.substring(1);
			System.out.println(restString);
			result = result + first + restString + " ";
		}
		
		return result.trim();
	}
	

}
