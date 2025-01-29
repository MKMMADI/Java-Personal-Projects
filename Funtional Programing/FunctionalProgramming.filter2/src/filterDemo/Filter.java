package filterDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
	
	public static void main(String args[])
	{
	
		List<String> Names = Arrays.asList("Katlego1011","DeKota","Siya","ItumelengDakat");
		List<String>LongNames = new ArrayList<String>();
		
		LongNames=Names.stream().filter(names->names.length()>10).collect(Collectors.toList());
		System.out.println(LongNames);
		Names.stream().filter(Name->Name.length()>10).forEach(System.out::println);
	}

}
