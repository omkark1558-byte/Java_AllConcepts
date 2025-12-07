package Colllection;
import java.util.List;
import java.util.*;

public class Collection_07 {

	public static void main(String[] args) {
		 
		
		
		List<Student> school = new  ArrayList<Student>();
		
		Student u = new Student();
		u.Gmail = "omkark1558@gmail.com";
		u.Name = "Omkar Kale";
		u.Number = 1234567890;
	
		Student i = new Student();
		i.Gmail = "AkshayM@gmail.com";
		i.Name = "Akshay more";
		i.Number = 13245636;

		 school.add(u);
		 school.add(i);
		 
		 System.out.println(school);
	}
}

class Student
{
	int Number;
	String Name;
	String Gmail;
	
	public String toString()
	{
		return this.Gmail + this.Name +this.Number;
	}
	
}
