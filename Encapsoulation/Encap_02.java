package Encapsoulation;

public class Encap_02 {

	public static void main(String[] args)	{
		 
		
			student02 Omii=new student02();
		        Omii.Name();
		        Omii.Student_Id();
		    }
		    
		}
		class Student
		{
		    public void Name()
		    {
		        System.out.println("Student Name Is : Xyz");
		    }

		}
		class student01 extends Student
		{
		    public void Student_Id()
		    {
		        System.out.println("Student id is : xyz @ 123");
		    }
		}
		class student02 extends student01
		{

		}
	
