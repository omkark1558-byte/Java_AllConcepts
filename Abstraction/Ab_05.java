package Abstraction;

public class Ab_05 {
	public static void main(String args[])
	{
	
		JIM j = new Workout();
		
		double amount = j.jeem(500.0);
		System.out.println(amount);
		
		 j.workout(40);
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
	
	public double jeem(double u)
	{
		return u;
	}
}
class Workout extends JIM
{

	@Override
	public void workout(int j) {
		
		System.out.println("Workout Time :" + j + " minutes");
	}
	
}
