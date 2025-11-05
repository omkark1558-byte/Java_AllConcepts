package Class;

public class Class_new02 {

	public static void main(String[] args) {
		 
		
		fruit Apple=new fruit();
		
		Apple.nu=50;
		Apple.Na="Jikke";
		
		System.out.println(Apple.Na);
		System.out.println(Apple.nu);
		
		System.out.println("------");
	
		fruit Banana=new fruit();
		
		System.out.println(Banana.Na);
		System.out.println(Banana.nu);
	}
}

class  fruit
{
	
	String Na="Fal";
	int nu=20;
}