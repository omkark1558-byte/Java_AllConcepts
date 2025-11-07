package polyimorphim;

public class Overriding_1 {

	public static void main(String[] args) {
		 
		car n=new car1();
//		n.bike();
		n.company1();
		n.company2();
		n.company3();
	}
}


class car
{
	public void bike()
	{
		System.out.println("This is paraents Class.!");
	}
	public car()
	{
		System.out.println("This Sec Class.1!");
	}

	public void company1()
	{
		System.out.println("FORD . Legender.");
	}
	public void company2()
	{
		System.out.println("FORD . Fortuner.!");
	}
	public void company3()
	{
		System.out.println("For. Invoa. 🚗");
	}
}
class car1 extends car
{
	public void  car()
	{
		
		System.out.println("This is overiding.!");
	}
	public void bike()
	{
		System.out.println("This Sec Consruter.!");	
	}
	public void company1()
	{
		super.company1();
		System.out.println("FORD : 1");
	}
	public void company2()
	{
		super.company2();
		System.out.println("FORD : 2");
	}
	public void company3()
	{
		super.company3();
		System.out.println("FORD : 3");
	}
//	public void company4()
//	{
//		
//	}
}
