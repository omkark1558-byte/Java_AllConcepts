package Abstraction;

public class Ab_01{

	public static void main(String[] args) {
		 
		Junk N=new Master();
		N.bunk();
		N.vision();

	}
}

abstract class Junk
{
	abstract void bunk();
	
	void vision() 
	{
		System.out.println("Vision Is body Part of Abstract.!");
	}
}
class Master extends Junk
{
	void vision()
	{
		System.out.println("Iiiiss;fk");
	}
	void bunk()
	{
		System.out.println("Luuuuu......!");
	}
	
}