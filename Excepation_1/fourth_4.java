package Excepation_1;


class InjecationException extends Exception
{
	public InjecationException()
	{
		super("First !");
	}
}
class Injecationone_Exception extends Exception
{
	public  Injecationone_Exception()
	{
		super("One And One Only...!");
	}
}
class Injectiontwo_Exception extends Exception
{
	public Injectiontwo_Exception()
	{
		super("Two Nes...!");
	}
}
class Injectiionthree_Exception extends Exception
{
	public Injectiionthree_Exception()
	{
		super("Thrid One");
	}
}
 public class fourth_4 {

	public static void main(String[] args) {
		 
		int p = 35;
		
		try 
		{
			if(p>30 && p<40)
			{
				throw new InjecationException();
			}else if(p>40 && p<50)
			{
				throw new Injecationone_Exception();
			}else if(p>50 && p<60)
			{
				throw new Injectiontwo_Exception();
			}else if(p>70 && p<80)
			{
				throw new Injectiionthree_Exception();
			}else {
				System.out.println("END OF THEY ERAR.../_\\");
			}
		}
		catch(InjecationException ex)
		{
			System.out.println(ex.getMessage());
		}
		catch(Injecationone_Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		catch(Injectiontwo_Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		catch(Injectiionthree_Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}

}
