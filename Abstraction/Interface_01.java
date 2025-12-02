package Abstraction;

public class Interface_01 {

	public static void main(String[] args) {
		 
		Omkar omi = new Omkar();
		omi.Name();	
		omi.Division();

		
		 System.out.println(School.Name);
	}
}

interface Students
{
	
	String Number = "7057782655";
	void Name();
	default void Division()
	{
		System.out.println(": 'A', 'B','C' :");
	}
}
interface School
{
	   static String Name = "Modern English School";	
}

class Omkar implements Students , School
{
	public void Name()
	{
		System.out.println("OMKAR KALE");
	}
	
	public void School()
	{
		System.out.println("");
	}
}
