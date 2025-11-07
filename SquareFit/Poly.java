package SquareFit;

public class Poly {

	public static void main(String[] args) {
		
		Animals ani = new Animals();
// 		overloading
		ani.run(43);
		ani.run();
		
		Animals ani1 = new Pet();
		ani1.run();
		ani1.run(34);
	
//		Bob bob  = new Bob();
//		bob.run();
//		bob.run(2);
//		
	 	
	}
}

class Animals
{
	Animals()
	{
		System.out.println("This is Constructor");
	}
	
	void run() 
	{
		System.out.println("empty para");
	}
	void run(int a ) 
	{
		System.out.println("int para");
	}
	
}

class Pet extends Animals
{
	
	void run() 
	{
		System.out.println("Pet Animal");
	}
	
	void run(int a) 
	{
		
		System.out.println("Animals park");
		
	}	
}