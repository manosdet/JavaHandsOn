package java8streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {
	public static void main(String[] args) {
		
		List<String> teamA =Arrays.asList("Scout","David","jhon");
		List<String> teamB =Arrays.asList("Scout","David","jhon");
		List<String> teamC =Arrays.asList("Scout","David","jhon");
		
		
		List<List<String>>playersInWorldCup = new ArrayList<List<String>>();
		playersInWorldCup.add(teamA);
		playersInWorldCup.add(teamB);
		playersInWorldCup.add(teamC);
		
		//Before Java8
		for(List<String> team:playersInWorldCup) {
			
			for(String name:team) {
				System.out.println(name);
			}
		}
		
		//Using stream flatMap()
		
		List<String> names=playersInWorldCup.stream().flatMap(plist->plist.stream()).collect(Collectors.toList());
		System.out.println(names);
	}
	
	
}
