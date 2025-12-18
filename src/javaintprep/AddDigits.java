package javaintprep;

public class AddDigits {

	public static void main(String[] args) {
		System.out.println(addDigits(67));
		
	}
	public static int addDigits(int num) {
		if(num<10) return num;
		
		int ans = 0;
		while(num != 0) {
			ans = ans + (num %10);
			num = num/10;
			
		}
		return addDigits(ans);
		}

}
