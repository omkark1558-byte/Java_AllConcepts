package Encapsoulation;

public class Encap_03 {
	public static void main(String args[])
	{
		
		car c=new car();
		c.Ford(450000.00);
		c.Ford(45.00, "Caar");
		c.Ford(12, 020, 015.0);
	}
}

class car
{
	public void Ford(double p)
	{
		System.out.println("Car : A+");
	}
	public void Ford(double p, String t)
	{
		System.out.println("Car Is : Legender Plus");
	}
	public void Ford(float y,int i,double j)
	{
		System.out.println("Car Is : Fortuner:(F)");
	}
}
