package Status_Code;

public class Status_02 {

	public static void main(String[] args) {
		 
		int num = 500;
		
		try
		{
			if(num > 60)
			{
				throw new StudetnisnotFound(405);
			}
		}catch(StudetnisnotFound y)
		{
			System.out.println(y.getNumber());
		}
	}
}


class StudetnisnotFound extends Exception
{
	
	int Number;
	public  StudetnisnotFound(int Number)
	{
		super("Student is found Him...!");
		this.Number = Number;
	}
	public int getNumber()
	{
		return this.Number;
	}
}
