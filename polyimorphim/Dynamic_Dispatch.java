package polyimorphim;

public class Dynamic_Dispatch {

public static void main(String[] args)
{
		 
		Name_Animal An=new A1();
		
		 An.Tiger();
		 An.Dogs();
		 An.Cats();
		 An.Bibtya(1);
	}

}

class Name_Animal
{

	public void Tiger()
	{
		System.out.println("T");
	}
	public void Dogs()
	{
		System.out.println("DO.>>>>>>>>>");
	}
	public void Cats()
	{
		System.out.println("Cat is Choanguu...!");
	}
	public void Bibtya(int t)
	{
		System.out.println("BIBTYA....");
	}
}
class A1 extends Name_Animal
{
	public void Cats()
	{
		super.Cats();
		System.out.println("Cat [Cat]!");
	}
	public void Tiger()
	{
		super.Tiger();
		System.out.println("Ti.");
	}
	public void program()
	{
		System.out.println("PRO..");
	}
	
	
}
