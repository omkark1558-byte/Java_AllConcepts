package Excepation_1;


public class Sec_2 {
	
	public static void main(String[] args) {
	
		int o = 20;
		
		try
		{
			if(o>10 && o<20)
			{
				throw new URUException();
			}
			else if(o>20 && o<30)
			{
				throw new URException();
			}else if(o>40 && o<50)
			{
				throw new UException();
			}
			else {
				System.out.println("HLw : "+o);
			}
		}
		catch (URUException ex)
		{
			System.out.println(ex.getMessage());
		}
		catch(URException ex)
		{
			System.out.println(ex.getMessage());
		}
		catch(UException ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			System.out.println("THE END ...!");
		}
	}
}
class URUException extends Exception
{
	public URUException()
	{
		super("URE Exception..⚠️");
	}
}
class URException extends Exception
{
	public URException()
	{
		super("UR Exception..⚠️");
	}
}
class UException extends Exception
{
	public UException()
	{
		super("U Exception..⚠️`");
	}
}
