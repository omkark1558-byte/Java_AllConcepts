package polyimorphim;

public class OverLoading {

	public static void main(String[] args)
	{
		 
		Bike b=new Bike();
		b.Honda(10);
		b.Honda("Shine");
		b.Honda(20);
//		b.wait();
		b.h();
	
		}
	}
class Bike
{
//	public Bike()
//	{
//		System.out.println("JDK.");
//	}
	public void Honda(int i)
	{
		 
		System.out.println("CB Honda Shine 125.");
	}
	public void Honda(String b)
	{
		this.Honda(2);
		System.out.println("HP Delux.");
	}
	public void Honda()
	{
		this.Honda("H");
		System.out.println("JSlkfjlaf");
	}
	public void Honda(double t,int p)
	{
		System.out.println("You.");
	}
	public void h()
	{
		
		this.Honda();
		System.out.println("Hus Uipi.");
	}
}


//class gadi extends Bike
//{
//	
//	public void Honda(int i)
//	{
//		super.Honda(i);
//		System.out.println("Shine CB :");
//		}
//	}
/*
 *  This method is Overloading (Polymorphism)
 */
