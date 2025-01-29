package flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {

		List<Integer> Numbers = Arrays.asList(1,2,3,4,5,6);
		List<Integer> Numbers2 = Arrays.asList(7,8,9,10,11,12);
		List<Integer> Numbers3 = Arrays.asList(13,14,15,16,17,18);
		
		
		List<Integer>IncrementBy5=Numbers.stream().map(number->number+5).collect(Collectors.toList());
		System.out.println(IncrementBy5);
		System.out.println();
		//FlatMap()
		
		//List Of Lists
		List<List<Integer>> FinalList = Arrays.asList(Numbers , Numbers2 , Numbers3);

		List<Integer> Result =FinalList
							.stream()
							.flatMap(ListOfLists->ListOfLists.stream()//Setting all lists to abstract streams
							.filter(n->n%2==0)//checking if it is even
							.map(List->List+5))//Adding 5 to all elements
							.collect(Collectors.toList()); //collecting lists into one List.
		
		System.out.println(Result);
	}

}
