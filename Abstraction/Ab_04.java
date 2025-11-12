package Abstraction;

public class Ab_04 {

	public static void main(String[] args) {
		 

		Apple N=new Apple();
		N.F_count();
		N.Eat();
	}
}
interface Frutes
{
	void Eat();

}
interface frutes 
{
	int F_count();
}
class Apple implements frutes
{
	public void Eat()
	{		 
		System.out.println("Eat the Apple..!");
	}
//	public int F_count()
//	{
//		System.out.println("How many Foods...!");
//	}

	@Override
	public int F_count() {
		return 0;
	}
}
