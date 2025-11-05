package Class;

public class Class_New01 {

	public static void main(String[] args) {
	
		Cars Yash=new Cars();
		Yash.Name="YAhhh......";
		 
		
		int Number=932245;
		
		System.out.println(Number);
		
	//	new Cars().Number;
		
		System.out.println(new Cars().Number);
		System.out.println(new Cars().chars);
		
		System.out.println(new Cars().Name);
	
		Yash.sambho();
		
	}
}

class Cars
{
	
	String Name="Yash";
	int Number=456;
	char chars='K';

public void sambho()
{
	System.out.println("Yashhh...!@");
	}
}