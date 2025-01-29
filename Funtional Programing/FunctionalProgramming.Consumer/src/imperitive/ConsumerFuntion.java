package imperitive;
import java.util.function.Consumer;
import consumer.*;

public class ConsumerFuntion {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer Kat=new Customer("Kat","0634527839");
		Greet(Kat);
		GreetCustomer.accept(Kat);
	}
	
	static void Greet(Customer objCustomer)
	{
		System.out.println("Hello "+objCustomer.customerName + 
							" your number is : " + objCustomer.customerPhoneNumber);
	}
	//void function using imperative programming
	static Consumer<Customer> GreetCustomer= 
			Customer -> System.out.println("Hello "+Customer.customerName + 
						" your number is : " + Customer.customerPhoneNumber);


}
