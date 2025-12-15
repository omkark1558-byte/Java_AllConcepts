package list_Collection_new;

import java.util.*;

public class List_01 {

	public static void main(String[] args) {
		 
		ArrayList<String> i = new ArrayList<String>();
		i.add("10");
		i.add("O");
		i.add("M");
		i.add("K");
		i.add("5");
		i.add("A");
//		i.addAll(Arrays.asList("23","54"));
		
		System.out.println(i);
	}
}
class Employee
{
	int id;
	String name;
	double salary;
	
	Employee(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString()
	{
		return this.id + this.name + this.salary;
	}
}
