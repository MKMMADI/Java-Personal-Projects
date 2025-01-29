import java.util.Scanner;

import employeeinfo.*;
import readAndStoreEmployeeData.*;
public class main {

	public static void main(String[] args) {

		EmployeeData ReadData = new EmployeeData();
		EmployeeInfo _Employees = new EmployeeInfo(ReadData.getNumberOfEmployees());
		for(int i = 0 ; i < ReadData.getNumberOfEmployees();i++)
		{
			//Getting int index ,int Employee_id , String department , int NumYears , int NumDependencies , String Degree,int NumEmployees
			_Employees.SetEmployeeData(i,ReadData.GetEmployeeID(i),ReadData.GetDepartMentInfo(i),
										ReadData.getNumberOfYears(i),ReadData.GetNumberOfDependecies(i),ReadData.GetDegreetype(i));
		}
		
		
		
		boolean blnContinue=true;
		
		do
		{
			int intChoice=0;
			System.out.println("Enter a number From 1 to 5 to select an option");
			System.out.println("1.Display Employee Data?");
			System.out.println("2.Write To Binary");
			System.out.println("3.Exit program");
			Scanner scan = new Scanner(System.in);
			intChoice=scan.nextInt();
			
			
			switch(intChoice)
			{
				case 1:
				{
					for(int i =0 ; i < _Employees.GetNumberOfEmployees();i++)
					{
						System.out.print("\t"+_Employees.GetEmployeeAtIndex(i).GetEmployeeID());
					    System.out.print("\t"+_Employees.GetEmployeeAtIndex(i).getDepartment());
						System.out.print("\t"+_Employees.GetEmployeeAtIndex(i).GetNumberOfYearsAtCompany());
						System.out.print("\t"+_Employees.GetEmployeeAtIndex(i).GetNumberOfDependencies());
						System.out.print("\t"+_Employees.GetEmployeeAtIndex(i).GetDegreeType());
						System.out.println();
					}
				}
				
				case 2:
				{
					_Employees.WriteToBinary();
				}
				
				case 3:
				{
					blnContinue = false;
				}
			}
			
		}while(blnContinue);
		
		
	}

}
