import java.util.Scanner;

public class MyFirstProject {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				int x =1;
				int y=1;
				int z = x+y;
				
				System.out.printf("The sum of x and y is: %d ",z);
				System.out.println();
				Scanner uInput = new Scanner(System.in);
				
				System.out.println("How old are you?");
				int Age = uInput.nextInt();
				System.out.print("Your age is "+Age);
				System.out.println();

				while(Age>5)
				{
					System.out.println("Horaay!!");
					Age--;
				}
				System.out.println();

				for(int i = 0; i <5 ; i++)
				{
					System.out.println("Horaay!!");
					System.out.println();

				}
				
				
				
				

	}

}
