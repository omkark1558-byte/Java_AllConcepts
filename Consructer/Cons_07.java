package Consructer;


class Demo
{
	Demo()
	{
		System.out.println("Deafult");
	}
	Demo(int x)
	{
		System.out.println("Value = " + x);
	}
	Demo(String s)
	{
		System.out.println("Name = " +s);
	}
}

public class Cons_07 {

	public static void main(String[] args) {
		  
		new Demo();
		new Demo(10);
		new Demo("O M K A R");
	}
}
