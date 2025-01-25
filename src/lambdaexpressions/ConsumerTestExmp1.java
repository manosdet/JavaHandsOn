package lambdaexpressions;
import java.util.function.Consumer;


public class ConsumerTestExmp1 {

	public static void main(String [] args) {
		
		Consumer <String> c=s-> System.out.println(s);
		
		c.accept("WELCOME");
	}
}
