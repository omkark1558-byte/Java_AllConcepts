package Abstraction;

abstract class Shape
{
	abstract public void Circle();
}
class shape01 extends Shape
{
	public void Circle() 
	{
		System.out.println("It is Main Class inSide the Constructer...⚠️");
	}
}
public class Ab_06 {

	public static void main(String[] args) {
	 
		
		Shape You = new shape01();
		
		You.Circle();

	}
}

