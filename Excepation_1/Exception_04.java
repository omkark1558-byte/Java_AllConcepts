package Excepation_1;

class Ward extends Exception
{
	 public Ward()
	{
		super("It's Ward No's Is First..... Vote For Your Eligibale Ward");
	}
}

class Ward2 extends Exception
{
	public Ward2()
	{
		super("Its ward_02...");
	}
}
public class Exception_04 {

	public static void main(String[] args) throws Ward,Ward2
	{
		 
		int i = 18;
		if(i<18 && i>25)
		{
			throw new Ward();
		}
		else if(i<25 && i>45)
		{
			throw new Ward2();
		}
		else 
		{
			System.out.println("It is Exception....!");
		}
	}
}


