package polyimorphim;

public class Moethod_Overl_03 {

	public static void main(String[] args) {

		c3 C=new c3();
		System.out.println(C.Name);

	// It is cases Is super() Call 

	}
}
class c1
{
	String Name="!-Concepet Of Super Call Methods !-";
	public c1()
	{
		System.out.println("It is Consructer Call it Is main class.!");
	}

}
class c2 extends c1
{
	public c2()
	{
		super();
		System.out.println("It's a Second Class of c2.!");
	}
}
class c3 extends c2
{
	public c3()
	{
		super();
		System.out.println("It's a Third Class Methods of c3");
	}
}