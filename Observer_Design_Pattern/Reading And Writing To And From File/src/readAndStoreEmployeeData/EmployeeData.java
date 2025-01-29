package readAndStoreEmployeeData;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.File;
import java.io.BufferedReader;


//Class is used to read data from file and store in arrays
public class EmployeeData
{
	//class members
	private long[] _Employee_ID;
	private String[] _Department;
	private int[] _NumberOfYearsAtCompany;
	private int[] _NumberOfDependencies;
	private String[] _DegreeType; 
	public int NumberOfEmployees;
	
	//constructor used to get data from text file
	public EmployeeData()
	{
		GetEmployeeDatafromTxt();
	}
	
	//retrieving data from text file.
	public void GetEmployeeDatafromTxt()
	{
		//using try catch block to catch unwanted errors and instantiating BufferedReader
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("employee_data.txt")), "UTF-8")))
		{
		
			//Dynamically getting number of lines or employees in file
			int NumLines =0;
			while(br.readLine()!=null)
			{
				NumLines++;
			}
			
			//Dynamically allocating arrays with number of employees
			_Employee_ID=new long[NumLines];
			_Department=new String[NumLines];
			_NumberOfYearsAtCompany= new int[NumLines];
			_NumberOfDependencies=new int[NumLines];
			_DegreeType=new String[NumLines];
			
			//reseting BufferedReader
			br.close();		
		}catch(IOException e)
		{
			e.getStackTrace();
		}
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("employee_data.txt")),"UTF-8")))
		{
			int index=0;
			String line;
			
			//While there is still a line to be read
			while((line=br.readLine())!= null)
			{
				//split line(???)
				StringTokenizer Split = new StringTokenizer(line , " ");
				_Employee_ID[index]=Long.parseLong(Split.nextToken());
				_Department[index]=Split.nextToken();
				_NumberOfYearsAtCompany[index]=Integer.parseInt(Split.nextToken());
				_NumberOfDependencies[index]=Integer.parseInt(Split.nextToken());
				_DegreeType[index]=Split.nextToken();
				
				//String[] Info = line.split(" ");
				
				/*//Assign line values to array at index
				_Employee_ID[index]=Long.parseLong(Info[0]);
				_Department[index]=Info[1];
				_NumberOfYearsAtCompany[index]=Integer.parseInt(Info[2]);
				_NumberOfDependencies[index]=Integer.parseInt(Info[3]);
				_DegreeType[index]=Info[4];*/
				//move to next index
				index++;	
			}
			
			NumberOfEmployees=index;
		}catch(IOException e)
		{
			e.getStackTrace();
		}
		
	}
	
	



	
	
	//Getters
	public long GetEmployeeID(int index)
	{
		return this._Employee_ID[index];
	}
	
	public int getNumberOfYears(int index)
	{
		return this._NumberOfYearsAtCompany[index];
	}
	
	public int GetNumberOfDependecies(int index)
	{
		return this._NumberOfDependencies[index];
	}
	
	public String GetDepartMentInfo(int index)
	{
		return this._Department[index];
	}
	
	public String GetDegreetype(int index)
	{
		return this._DegreeType[index];
	}
	
	public int getNumberOfEmployees()
	{
		return this.NumberOfEmployees;
	}
}
