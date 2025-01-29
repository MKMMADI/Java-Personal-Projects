package filternulls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNulls {

	public static void main(String[] args) {

		List<String> Words = Arrays.asList("cup","yay",null,"yo",null);
		List<String> Results =new ArrayList<String>();
		
		Results = Words.stream().filter(words->words!=null).collect(Collectors.toList());
		System.out.println(Results);
		//or
		Words.stream().filter(words->words!=null).forEach(System.out::println);
		
	}

}
