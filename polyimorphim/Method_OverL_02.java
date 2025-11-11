package polyimorphim;

public class Method_OverL_02 {

	public static void main(String[] args) 
	{
		 
		You1 o=new You1();
		System.out.println("----------");
		o.Man();
		System.out.print(":> ");
		o.Man1();
		System.out.println(o.Name);

	}
}
class You
{
	String Name="Man";
	
	public You()
	{
		
	}
	public You(int i)
	{
		System.out.println("This is Consructer is Yoou..!");
	}
	public void Man()
	{
		System.out.println("You Method is class");
	}
	public void Man1()
	{
		System.out.println("Man1 is method Of class");
	}
	
}
class You1 extends You
{
	public String Name="Main";
	public You1()
	{
	super(2); // Call Them Fix Call in Super Call
	System.out.println("Sec Consructer Is Second Class.!");
	}
}
