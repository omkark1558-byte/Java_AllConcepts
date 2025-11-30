package Status_Code;


public class Status_ {

	public static void main(String[] args) {
		 

		int Age = 678;
		try
		{
			if(Age > 60)
			{
				throw new Usernotfound(505); 
			}
		}catch(Usernotfound us)
		{
			System.out.println(us.getStatuscode());
		}
	}

}

class Usernotfound extends Exception
{
	int Statuscode;
	
	public Usernotfound(int Statuscode)
	{
		super("User Is Not Found....!");
		this.Statuscode = Statuscode;
	}
	public int getStatuscode()
	{
		return this.Statuscode;
	}
}
