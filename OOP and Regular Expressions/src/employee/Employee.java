package employee;
import person.*;

import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Employee extends Person
{
	Scanner scInput = new Scanner(System.in);
	private String staffnumber ;
	private String Departmant;
	
	public Employee(String name , int age )
	{
		super(name,age);	
	}
	
	public void SetStaffNumber()
	{
		System.out.print("Please enter your staff number:" );
		this.staffnumber = scInput.next();
		checkStaffNumber();
	}
	

	private boolean checkStaffNumber()
	{
		String PTN= "SN[0-9]{5}[a-zA-Z]{2}";
		
		Pattern PT = Pattern.compile(PTN);
		Matcher MT = PT.matcher(PTN);
		
		if(MT.matches()==true)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	 
	
	@Override 
	public void setEmail()
	{
		System.out.println("Please enter your email");
		this.EMail = scInput.next();
		this.checkStaffNumber();
	}

	
}
