package Abstraction;

public class Ab05 {
	public static void main(String args[])
	{
	
		JIM j=new Workout();
		 
		 j.workout(0);
		 j.start();
	}
}
abstract class JIM 
{
	double Price=5000.0;
	
	public abstract void workout(int j);
	
	public void start()
	{
		System.out.println("Work Start");
	}
}
class Workout extends JIM
{

	@Override
	public void workout(int j) {
		
		
	}
	
}
