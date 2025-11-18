package Excepation_1;

public class Thirr_3 {

	public static void main(String[] args) {
	
		Demo2 N = new Demo2("H");
		System.out.println(N.str);
	
		
//		N.oj("NANDUUUU.....!");
//		N.oj("LAVINA");
		
		
	}
}
class Demo
{
	String str="Omees's";
	public void oj()
	{
		
		System.out.println("IT'S A SUMMER SESSION...😶‍🌫️");
	}
	public Demo(String str)
	{
		System.out.println("It Is A XYZ ....!");
	}
	public Demo() {
		System.out.println("Default Constructor .... 1");
	}
	public String getmessage()
	{
		return this.str;
	}
}

class Demo2 extends Demo
{
	
	public void oj()
	{
		System.out.println("IT IS COLD COPY...!");
	}
	
	public Demo2(String str) {
//		super("hello");
		super(str);
		System.out.println("Default Constructor ..... 2");
	}
}
