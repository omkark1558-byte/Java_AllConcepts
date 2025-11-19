package Abstraction;

public class Ab_02New {

	public static void main(String[] args) {

		Jio h=new Jio1();
		h.SIM(0);
		h.Network("Numbers");
		h.Owner("Ok");
		
		System.out.println("***            ***");
		
		Jio p=new Jio2();
		p.Network("Ho");
		p.Owner("Hok");
		p.SIM(3);
		
		
	}
}
abstract class Jio
{
	public String Name="Owner";
	
	public abstract void SIM(int i);
	
	abstract void Network(String st);
	
	abstract void Owner(String yo);
}

class Jio1 extends Jio
{
	public void SIM(int i)
	{
		System.out.println("SIM Is Jio Company..!");
	}
	public void Network(String st)
	{
		System.out.println("< SIM & Company Net Worth is All India..@ >");
	}
	public void Owner(String yo)
	{
		System.out.println(": Is Compane Owner Of Ananta Ambani..! >");
	}
}

class Jio2 extends Jio
{

	@Override
	public void SIM(int i) 
	{
		System.out.println("Nettwork .....!");
	}

	@Override
	void Network(String st) 
	{
		System.out.println("Jioooo.....!");
	}

	@Override
	void Owner(String yo) 
	{
			System.out.println("<.AMBANI.>");
	}	
}