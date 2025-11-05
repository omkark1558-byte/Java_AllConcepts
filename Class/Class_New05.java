package Class;

public class Class_New05 {

	public static void main(String[] args) {
		 
	College Class=new College();
	
	Class.Name="YashRaj Korde";           // (* Static Variable *Static Method * Static Block)
	Class.Standered=12;
//	Class.Grade='B';
	
	
	College Class01=new College();
	Class01.Name="Aditya Sarde";
	Class01.Standered=12;
//	Class01.Grade='C';
	
	College Class03=new College();
	
	Class03.Name="Kadam Aditya";
	Class03.Standered=12;
//	Class03.Grade='A';
	
	System.out.println(Class03.Name);
	System.out.println(Class03.Standered);
	System.out.println(Class03.Grade);
	
	Class03.pass02();
	
	
	System.out.println("------------");
	
	
	System.out.println(Class01.Name);
	System.out.println(Class01.Standered);
	System.out.println(Class01.Grade);
	
	Class01.pass01();
	
	System.out.println("-----------");
	
	System.out.println(Class.Name);
	System.out.println(Class.Standered);
	System.out.println(Class.Grade);
	
	Class.pass();

//	Class.pass03();
	}

}

class College
{
	String Name;
	int Standered;
	final char Grade='A';

	public void pass()
	{
		System.out.println("Student In Educateing...!");;
	}
	public void pass01()
	{
		System.out.println("Student is Not Passing..@");
	}
	public void pass02()
	{
		System.out.println("Student Study in 1st Class...@");
	}
	public static void pass03()
	{
		System.out.println("it is colelmaksjf.....");
	}
	
}

/* static components are static level components are 
 * meaning when your create object of the
 *  class all the object will be share the same
 *   without creating the componds 
 */


