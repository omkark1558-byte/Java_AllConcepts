package SquareFit;

public class Car_01 {

	public static void main(String[] args) 
	{
		cars2 v=new cars2();
		v.car1();
		v.car1(20);
		v.model();
		v.model(5);
	}

}

class car
{
	public void car1()
	{
		System.out.println("It is a car RUN ...");
	}
	public void car1(int i)
	{
		System.out.println("Car is Stop.");
	}
}
class car1 extends car
{
	void model()
	{
		System.out.println("Car Model.");
	}
	void model(double t)
	{
		System.out.println("top model is car.");
	}
}
class cars2 extends car1
{
	
	public void model()
	{
		System.out.println("FORD.");
	}
	
	public void main()
	{
		System.out.println("...<<<>>>....");
	}
	
	public void model(double y)
	{
		System.out.println("LEGENDER.");
	}
}