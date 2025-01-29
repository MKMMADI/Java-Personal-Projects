package employeeinfo;
import employee.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeInfo 
{
	//class members 
	private int NumberOfEmployees;
	private Employee[] Employees;
	
	//constructor
	public EmployeeInfo(int NumEmployees)
	{
		//method to dynamically allocate memory to Employee array.
		SetEmployee(NumEmployees);
	}
	public void SetEmployeeData(int index ,long Employee_id , String department , int NumYears , int NumDependencies , String Degree)
	{
		//Instantiating object in array and assigning values to object members  
		Employees[index]=new Employee(Employee_id,department,NumYears,NumDependencies,Degree);
		

	}

	private void SetEmployee(int NumberOfEmployees)
	{
		//Assigning value to member and allocating memory to Employee array.
		this.NumberOfEmployees=NumberOfEmployees;
		this.Employees = new Employee[this.NumberOfEmployees];
	}
	
	public int GetNumberOfEmployees()
	{
		return this.NumberOfEmployees;
	}
	
	public Employee GetEmployeeAtIndex(int index)
	{
		return this.Employees[index];
	}
	
	public void WriteToBinary()
	{
		File file=new File("employees_data.bin");
		try(ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream(file)))
		{
			OOS.writeObject(Employees);
		}
		catch(IOException e)
		{
			e.getStackTrace();
		}
	}
	
	public void ReadEmployeesFromBinaryFile() {
		
		try(ObjectInputStream OIS = new ObjectInputStream(new FileInputStream("employees_data.bin")))
		{
			//OIS.readObject(Employees);
			
		}catch(IOException e)
		{
			e.getStackTrace();
		}
		
		
	}
	
	
	
	
		
	
}