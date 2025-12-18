package java8streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Find the vihicle name length
public class MapDemo2 {

	public static void main(String[] args) {
		List<String> vehicles = Arrays.asList("bus","car","bicycle","flight","train");
		
		List<String>  vehiclesListInUppersCase = new ArrayList<String>();
		
		//without using streams 
		
		for(String name :vehicles) {
			System.out.println(name.length());
		}
		
		
	//	using stream Map()
		
		vehicles.stream().map(vname->vname.length()).forEach(len-> System.out.println( len));
		vehicles.stream().map(vname->vname.length()).forEach(System.out::println);
	}

}
