package Excepation_1;

import java.util.Scanner;

class OBC_Exception extends Exception
{
	public OBC_Exception()
	{
		 super("The Fee Belong's To the OBC Catagery..⚠️");
	}
}
class NT_Exception extends Exception
{
	public NT_Exception()
	{
		super("Your Are The NT..!");
	}
}
class  SC_Exception extends Exception
{
	public  SC_Exception()
	{
		super("Your Are The SC :");
	}
}
class  OPEN_Exception extends Exception
{
	public  OPEN_Exception()
	{
		super("You Are The OPEN..!");
	}
}
class Donation_Exception extends Exception
{
	 public  Donation_Exception()
	 {
		 super("You Get Addimission Through The Donation..⚠️");
	 }
}

public class Exception_Handling {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A Fees OF Candied...!");
		int i = sc.nextInt();
		
		
		try {
			if(i>75000 && i<85000)
			{
				throw new OBC_Exception();
			}else if(i>55000 && i<75000)
			{
				throw new NT_Exception();
			}
			else if(i>45000 && i<55000)
			{
				throw new SC_Exception();
			}
			else if(i>95000 && i<100000)
			{
				throw new OPEN_Exception();
			}
			else if(i>100000 && i<160000)
			{
				throw new Donation_Exception();
			}else {
				System.out.println("Incorrect the Donation Please valid Amout..!");
			}
		}
		catch(OBC_Exception	ex)
		{
			 System.out.println(ex.getMessage());
		}
		catch(NT_Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		catch(SC_Exception ex)
		{
			 System.out.println(ex.getMessage());
		}
		catch(OPEN_Exception ex)
		{
			 System.out.println(ex.getMessage()); 
		}
		catch(Donation_Exception ex)
		{
			 ex.printStackTrace();
		}
	}
}


