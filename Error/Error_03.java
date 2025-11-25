package Error;

import java.util.List;

import java.util.ArrayList;

/*
 * Error is Not Handel
 * Ans Final Block is Not Execute in Any Time....! 
 */

public class Error_03 {

	public static void main(String[] args) {
		 
		
		
		List<Voter> list = new ArrayList<Voter>();
		
		int id = 1;
		String Name = "OMKAR";
		try {
		while(true)
		{
			list.add(new Voter(id,Name));
			}
		}
		catch(OutOfMemoryError ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			System.out.println("Finally Block Is Not Execute...!");
		}
	}

}

class Voter
{
	int ID;
	String Name;
	
	public Voter(int ID, String Name)
	{
		this.ID = ID;
		this.Name = Name;
	}
}