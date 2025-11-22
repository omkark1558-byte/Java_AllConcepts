package Consructer;

class Mobile
{
	private double Price;
	String Name;
	int One;
	
	Mobile()
	{
		System.out.println("PRice Of Phone : "+Price);
	}
	Mobile(String Name)
	{
		System.out.println("Name OF Phone : "+Name);
	}
	Mobile(int One)
	{
		System.out.println("Pesses Of Phone : "+One);
	}
}

public class Cons_06 {
	public static void main(String args[])
	{
		Mobile O = new Mobile(15000);
		Mobile P = new Mobile("SAMSUNG");
		Mobile i = new Mobile(1);
	//	O.Name = "VIVO";
	}
}
