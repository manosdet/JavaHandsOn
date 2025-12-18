package java8streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
public static void main(String [] args) {
	
	List<String> vehicles = Arrays.asList("bus","car","bicycle","flight","train");
	
	List<String>  vehiclesListInUppersCase = new ArrayList<String>();
	
	
	//normal flow
	
	for(String name:vehicles) {
		vehiclesListInUppersCase.add(name.toUpperCase());
	}
	System.out.println(vehiclesListInUppersCase);
	
	
	
	//using stream Map()
	
	vehiclesListInUppersCase =vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
	
	System.out.println(vehiclesListInUppersCase);
	
	vehicles.stream().map(name->name.toUpperCase()).forEach(name-> System.out.println(name));
	
	
}
}
