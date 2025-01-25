package javaintprep;

public class ReversString {
	public static void main(String [] args) {

		String str = "youaremdo" ;
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb.toString());


		int l = str.length();

		String revstr ="";


		for(int i= l-1; i>=0; i--) {
			char ch = str.charAt(i);

			revstr = revstr +ch;
		}

		System.out.println(revstr);
	}
}
