package filterAndMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
	String Name;
	int Salary;
	String empID;
	
	public Employee(String name , int salary , String ID)
	{
		this.Name=name;
		this.Salary=salary;
		this.empID=ID;
	}
}

public class FitlterAndMap {
	//Filter first the map
	public static void main(String args[])
	{
		List<Employee> Employees = new ArrayList<Employee>();
		List<Integer>EmployeesEarningMoreThan10000=new ArrayList<Integer>();
		
		Employees.add(new Employee("Kat",10000,"kat22105"));
		Employees.add(new Employee("Venesa",120000,"Venesa22105"));
		Employees.add(new Employee("Kate",105000,"Kate22105"));
		Employees.add(new Employee("Katlego",110000,"Katlego22105"));
		Employees.add(new Employee("Jabulani",100000,"Jabulani22105"));
		Employees.add(new Employee("Micheal",105000,"Micheal22105"));
		
		EmployeesEarningMoreThan10000=Employees.stream().filter(Employee->Employee.Salary>10000).map(Employee->Employee.Salary).collect(Collectors.toList());
		System.out.print(EmployeesEarningMoreThan10000);
	}
}
