package Hashcode;

import java.util.Objects;

public class Hashcode_02 {

	public static void main(String[] args) {
	 
	
		 O_MyGod u = new  O_MyGod("Omakr",200);
		 
		 
		 O_MyGod I= new O_MyGod("Gauri",300);
		 
		 System.out.println(u.equals(u));
		 System.out.println(I.equals(I));
		 
		 System.out.println(I.hashCode());
		 System.out.println(u.hashCode());
		 
		  
		  
	}

}
class O_MyGod
{
	int Number;
	String Name;
	

	public O_MyGod (String Name,int Number)
	{
		this.Name=Name;
		this.Number=Number;
	}
	
	public int hashCode()
	{
		return Objects.hash(Name,Number);
	}
}
