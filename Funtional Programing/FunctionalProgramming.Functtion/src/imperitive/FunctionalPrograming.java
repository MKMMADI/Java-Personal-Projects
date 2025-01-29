package imperitive;
import java.util.function.Function;

public class FunctionalPrograming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int addtoNumber = increment.apply(5);
		int Product = MultiplyBy10.apply(addtoNumber);
		int AddOneAndMultiplyBy10 =addByOeAndThenMultiplyBy10.apply(5);
		
		System.out.println(addtoNumber);
		System.out.println(Product);
		System.out.println(AddOneAndMultiplyBy10);
	}

	//adding one to an integer 
	static Function<Integer,Integer> increment = 
			number -> (number+1);
	
	/*The Same as :
	 * public int increment(int number)
	 * {
	 * 
	 * 		return number+1;

		} */
	
	//Multiplying an integer by 10
	static Function <Integer , Integer> MultiplyBy10= 
			number-> number *10;
		
	//function in a function(.andThen)
	static Function<Integer,Integer> addByOeAndThenMultiplyBy10=
			increment.andThen(MultiplyBy10);
}
