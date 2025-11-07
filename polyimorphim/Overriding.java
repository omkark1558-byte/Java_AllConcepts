package polyimorphim;

public class Overriding {

	public static void main(String[] args) {
 
	Bank_acc b=new Bank();
	b.user();
	b.User();
	

	}
}

class Bank_acc
{
	
	private String Name="User : Name.!";
	
	public void user()
	{
		System.out.println("user of class Bank Acc.");
	}
	public Bank_acc() // it is default Constructor 
 	{
		System.out.println("user.Of Bank /> 🏦");
	}
	
	public void User()
	{
	System.out.println(Name);
	}
}

class Bank extends Bank_acc
{
	public void user()
	{
		System.out.println("User Of Second class.");
	}
	public Bank()
	{
		
		System.out.println("!...😒...@");
	}
	
}