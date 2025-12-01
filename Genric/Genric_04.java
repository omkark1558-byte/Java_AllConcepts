package Genric;

public class Genric_04 {

	public static void main(String[] args) {
 

		Wanted I = new Wanted1();
		I.aroapi("302", "Nandakishor");
	}
}

interface Wanted
{
	void aroapi(String N,String Age);
}

class Wanted1 implements Wanted
{
	public void aroapi(String N,String Age)
	{
		System.out.println("Age OF Wanted...! " + N+Age);
	}
}

class Third extends Wanted1
{
	public void aroapi(String N,String Age)
	{
		System.out.println(N+Age);
	}
}