package Excepation_1;

class InvalidException extends Exception
{
	public InvalidException(String str)
	{
		super(str);
	}
}

public class Exception_First_1 {

	public static void main (String args[])
	{
		int Y=20;
		
		try{
			
		if(Y<19)
		{
			throw new InvalidException("Greatest Value ...!");
			
			}
		}
		catch(InvalidException ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			System.out.println("The Black Zone.....!");
		}
	}
}
