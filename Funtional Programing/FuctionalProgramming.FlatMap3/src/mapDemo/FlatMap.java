package mapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student
{
	String Name;
	int ID;
	char Grade;
	
	Student(String name,int id,char grade)
	{
		this.Name=name;
		this.ID=id;
		this.Grade=grade;
	}
}

public class FlatMap {

	public static void main(String[] args) {

		 List<Student> MathematicsStudents = new ArrayList<Student>();
		 
		 MathematicsStudents.add(new Student("Katlego",01,'A'));
		 MathematicsStudents.add(new Student("Naledi",02,'A'));
		 MathematicsStudents.add(new Student("Tumisho",03,'C'));
		 MathematicsStudents.add(new Student("Zakes",04,'D'));
		 
		 List<Student>StatisticsStudents = new ArrayList<Student>();
		 
		 StatisticsStudents.add(new Student("John",05,'A'));
		 StatisticsStudents.add(new Student("Jane",06,'D'));
		 StatisticsStudents.add(new Student("Jeffery",07,'C'));
		 StatisticsStudents.add(new Student("Jonah",8,'B'));
		 StatisticsStudents.add(new Student("Sual",9,'A'));
		 
		 List<List<Student>> FacultyOfScience = Arrays.asList(MathematicsStudents, StatisticsStudents);
		 
		List<Student> TopStudents = new ArrayList<Student>();
		
		TopStudents = FacultyOfScience.stream()
					.flatMap(Students->Students.stream()
					.filter(Student->Student.Grade<='A'))
					.forEach(SmartOnes->SmartOnes.Name).collect(Collectors.toList());
		
		System.out.println(TopStudents);
		 
	}

}
