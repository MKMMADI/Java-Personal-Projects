package mapDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Mapping {

	public static void main(String[] args) {

		List<String> Vehicles =  
				Arrays.asList("Ford","VolksWagen","Morcedes","BMo");
		
		Vehicles.stream()
				.map(vehicles->vehicles.length())
				.collect(Collectors.toSet())
				.forEach(System.out::println);
		
		System.out.println();
		
		Vehicles.stream()
				.map(vehicles->vehicles.length())
				.forEach(System.out::println);

	}

}
