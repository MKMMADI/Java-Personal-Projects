package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

	public static void main(String[] args) {

		//Map :: performs operation on all elements in collection.
		
		List<String> Vehicles =  Arrays.asList("Ford","VolksWagen","Morcedes","BMo");
		List<String> toBeMapped = new ArrayList<String>();
		
		toBeMapped=Vehicles.stream().map(vehicle -> vehicle.toUpperCase()).collect(Collectors.toList());
		System.out.println(toBeMapped);
		
		System.out.println();
		
		Vehicles.stream().map(vehicle->vehicle.toUpperCase()).forEach(System.out::println);
		
	//	Vehicles.stream().d
		//System.out.println(Truth);
		
		for(String Mapped : Vehicles)
		{
			System.out.println(Mapped.toUpperCase());
		}
	}

}










