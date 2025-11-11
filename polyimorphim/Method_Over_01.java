package polyimorphim;

// Concept Of Method Overloading In Polymorphism 

public class Method_Over_01 {

	public static void main(String[] args) {
		 
		
		Projecter H=new Projecter();
		H.projecter1();
		H.projecter1(0);
		Projecter.In();
		H.Un();
		H.Un(20);
//		System.out.println(H.Un(20));

	}
}

class Projecter
{
	public void projecter1()
	{
		System.out.println("Projecter is Under Class Method .!");
	}
	public void projecter1(int i)
	{
		System.out.println("It is Sec Projecter of under Class Of Method.!");
	}
	public static void In()
	{
		System.out.println("static Method ...!⚠️");
	}
	final public void Un()
	{
		System.out.println("!");
	}
	final public void Un(int i)
	{
		this.Un();
		System.out.println("JDK.!");
	}
}
