package Consructer;


class Test
{
	Test()
	{
		this(20);
		System.out.println("Default Constructer ");
	}
	Test(int i)
	{
		System.out.println("Parameterized" + i);
	}
}
public class Cons_09 {

	public static void main(String[] args) {
 
		Test o = new Test();
	}
}
