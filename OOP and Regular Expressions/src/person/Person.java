package person;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Person 
{

	protected String name;
	protected int age;
	protected char[] gender ;
	protected String EMail;
	protected String PhoneNumber;
	Scanner scInput=new Scanner(System.in);
	public Person(String Name , int Age)
	{
		this.setName(Name);
		
		
	};
	
	
	private void setName(String Name)
	{
		this.name = Name ;
	};
	
	private void setAge(int Age)
	{
		this.age=Age;
	};
	
	public void setEmail()
	{
		System.out.println("Please enter your email");
		this.EMail = scInput.next();
		if(this.checkEmail())
		{
			
		}
	};
	
	public void setPhoneNumber()
	{
		System.out.println("Please Enter Your Phone Number");
		this.PhoneNumber = scInput.next();
		if(this.checkPhoneNumber()==false)
		{
			
		}
		System.out.println(this.checkPhoneNumber());
	};
	
	protected boolean checkPhoneNumber()
	{
		String re = "0[6|7|8][0-9]{8}";
		Pattern PT = Pattern.compile(re);
		Matcher MT= PT.matcher(this.PhoneNumber);
		if(MT.matches()== true)
		{
			return true;
		}else {
			return false;
		}
		
	}
	
	protected boolean checkEmail()
	{
	
		String pattern ="[a-z]+@[a-z]+.com";
		Pattern PT = Pattern.compile(pattern);
		Matcher MT = PT.matcher(this.EMail);
		
		if(MT.matches()==true)
		{
			return true;
		}else {
			return false;
		}
		
		
		
				
		
		
	}
	
	
}





