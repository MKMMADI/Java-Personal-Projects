
import java.util.Scanner;
import employee.*;

public class main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scInput=new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scInput.next();
		System.out.println();
		System.out.println("How old are you?");
		int age = scInput.nextInt();
		
		Employee First = new Employee(name,age);
		First.setPhoneNumber();
		scInput.close();

	}

}
