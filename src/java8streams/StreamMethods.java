package java8streams;
//distinct()
//limit()
//count()

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

	public static void main(String[] args) {
		List<String>vehiclesList=Arrays.asList("bus","car","bicycle","car","bike");
		
	//List<String> distinctVehicles=	vehiclesList.stream().distinct().collect(Collectors.toList());
	//System.out.println(distinctVehicles);
	
		vehiclesList.stream().distinct().forEach(value->System.out.println(value));

//Count


	}

}
