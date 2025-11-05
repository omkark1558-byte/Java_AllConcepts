package Encapsoulation;

public class Encap_01{
	public static void main(String args[])
	{
		
		
//		  Legender Gadi=new Legender(); Gadi.Run();
//		  
//		  Gadi.Wonder();
//		  
//		  
//		  ford1 g=new ford1();.
//			g.Run(); 
//			g.Wonder(); 
//			System.out.println(g.Colour);
		
		Ford2 Gadii=new Ford2();
		Gadii.Run();
		Gadii.Wonder();
		System.err.println(Gadii.Colour);		
		Gadii.Rasess();
	}
	
}

class Car
{
	public void Run()
	{
		System.out.println("Car is Runninig..>");
	}
}
class Legender extends Car
{
	public void Wonder()
	{
		System.out.println("Car is Beautifullly...>");
	}
}
class Ford extends Legender
{
	
	final String Colour="White";
	
}
class ford1 extends Ford
{

	public void Rasess()
	{
		System.out.println("Car So Nice");
	}
}
class Ford2 extends ford1
{
	
}