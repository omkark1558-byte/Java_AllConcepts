package Status_Code;

import java.util.Scanner;

public class Status_03 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);	 
		try
		{ 
			System.out.println("Enter Your Age..!");
			
			int Age = sc.nextInt();
			Elections.Election_1(Age);
		
		}
		catch(Electioneligibal F)
		{
			System.out.println(F.getMessage() + "Do It The vote");
		//	System.out.println(F.getstatusCode());
		}
		catch(notelegibalException S)
		{
			S.printStackTrace();
			System.out.println(S.getStatusCode());
		}
		 
	}

}

class Electioneligibal extends Exception
{
//	int statusCode; 
	
	public Electioneligibal(String H)
	{
		super(H);
	//	this.statusCode = statusCode;
	}
//	public int getstatusCode()
//	{
//		return this.statusCode;
//	}
}
class notelegibalException extends Exception
{
	int StatusCode;
	
	public notelegibalException(String J , int StatusCode)
	{
		super(J);
		this.StatusCode = StatusCode;
	}
	public int getStatusCode()
	{
		return this.StatusCode;
	}
}

class Elections 
{
	public static void Election_1(int Age) throws Electioneligibal,notelegibalException 
	{
		if(Age > 18 && Age < 45)
		{
			throw new Electioneligibal("Your Are Eligibal For Voting ... Do the Vote..!");
		}
		else if(Age > 45 && Age <90)
		{
			throw new notelegibalException("DENGER ZONE..⚠️ you are not eligibal for voting !",505);
		}
	}
}