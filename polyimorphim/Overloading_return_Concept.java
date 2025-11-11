package polyimorphim;

public class Overloading_return_Concept {

	public static void main(String[] args) {
	
		  banks u=new Ban2();
	//	  ((Ban2)u).apple();// Type casting 
		  System.out.println(u.Na());
	}
}
 
class banks
{
	String Name="HDFC Bank";
	
	public void name(String m)
	{
		System.out.println(m);
	}
	
	public void Ac_N(String Name)
	{
		System.out.println("First name of Bank Acc Holder's 🏦.!");
	}
	public String Na()
	{
		return "Weekend Account Worker's";
	}
//		public String Na()
//		{
//			return "Account Referance";
//		}
}
class Ban1 extends banks
{	
	public static void Ac_N()
	{
		System.out.println("It is OverRinding Methods.!");
	}
	// Return concept For Overloading //
	
	public int value(int i)
	{
		 return 20;
	}
	public String Na()
	{
		return "Account Referance";
	}
}
class Ban2 extends Ban1
{
	public void name(String g)
	{
		System.out.println("Jeet Ke Karib Hai.!");
	}
	
	public int value(int i)
	{
		return 200;
	}
	private void bank_Details()
	{
		System.out.println("Private Details.!");
	}
	public void ban3()
	{
		this.bank_Details();
	}
	
	public void apple()
	{
		System.out.println("This is apple.");
	}
	public String Na()
	{
		return "Panjab bank";
	}
}
