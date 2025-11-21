package Excepation_1; 
import java.util.Scanner;

class VoterException extends RuntimeException
{
	public VoterException()
	{
		System.out.println("You'r Voter ID Is Eligibel For Vote..!"); 
		System.out.println("Do it For Vote..!");
	}
}

class NotvoterException extends Exception
{
	public NotvoterException()
	{
		 super("⚠️..Not Eligible..⚠️");
	}
}

public class Exception_Handling_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age...!");
		int u = sc.nextInt();
		
		try 
		{
			if(u>18 && u<45)
			{
				throw new VoterException();
			}else if(u>45 && u<85)
			{
				throw new NotvoterException();
			}
			else
			{
			System.out.println("Please Enter Valid Voter Age...!");
		}
	}
		catch(VoterException ex)
		{
			ex.getMessage();
		}
		catch(NotvoterException ex)
		{
			ex.printStackTrace();
		}
	}
}
