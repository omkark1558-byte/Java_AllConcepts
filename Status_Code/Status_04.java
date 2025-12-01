package Status_Code;
import java.util.Scanner;

public class Status_04 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); 
		
		try {
			System.out.println("Enter You are Age..!");
			int Age = sc.nextInt();	
			Student.Student_01(Age);
			
			
		}catch(StudentEligibalexception F)
		{
			System.out.println(F.getstatuscode());
			System.out.println("You Are Eiligibal: "+ F.getMessage());
		}catch(StudentNoteligibalException S)
		{
			System.out.println(S.getMessage());
			S.printStackTrace();
		}
		

	}

}

class StudentEligibalexception extends Exception
{
	
	int statuscode;
	public StudentEligibalexception(String tsr, int statuscode)
	{
		super(tsr);
		this.statuscode = statuscode;
	}
	public int getstatuscode()
	{
		return this.statuscode;
	}
}

class StudentNoteligibalException extends Exception
{
	int statuscode;
	public StudentNoteligibalException(String Str,int statuscode)
	{
		super(Str);
		this.statuscode = statuscode;
	}
	public int getstatuscode()
	{
		return this.statuscode;
	}
}

class Student
{
	public static void Student_01(int Age) throws StudentEligibalexception,StudentNoteligibalException
	{
		if(Age > 5 && Age < 18)
		{
			throw new StudentEligibalexception("You Are For Eligibale For 1st To 10th Addmission...!",202);
		}
		else if(Age > 18 && Age < 21)
		{
			throw new StudentEligibalexception("You are Eligibel for 11th To 2nd Year Colleage Addimisions...!",202);
		}
		else if(Age >21 && Age < 100)
		{
			throw new StudentNoteligibalException("NOT ELIGIBLE...⚠️",505);
		}
	}
}