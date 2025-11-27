package Hashcode;

import java.util.Objects;

public class Hascode_01 {

	public static void main(String[] args) {
	
		Imp i = new Imp("OMKAR",20.56);
	
		Imp U = new Imp("OMKAR",20.56);
		
		
		System.out.println(i.equals(i));
	
	
		System.out.println(i.hashcode());
		System.out.println(U.hashcode());
		
		
		
		
		

	}

}
class Imp
{
	String Name;
	double Price;
	
	public Imp(String Name,double Price)
	{
		this.Name=Name;
		this.Price=Price;
	
	}
	
	public int hashcode()
	{
		return Objects.hash(Name,Price);
	}
}