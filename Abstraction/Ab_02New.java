package Abstraction;

public class Ab_02New {

	public static void main(String[] args) {
		 
		Ioj y=new You();
		y.To();
	}
}

interface Ioj
{
	void To();
	
}
class You implements Ioj
{
	public void To()
	{
		System.out.println("Hlwww...!");
	}
}