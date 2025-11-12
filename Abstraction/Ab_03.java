package Abstraction;

public class Ab_03 {

	public static void main(String[] args) {
		 
		Fcatory h=new Fcatory();
		//h.Oldclothes();
		h.Newclcothes();

	}
}

interface Ajio
{
	void Newclcothes();
	
	void old_version();
	
	default int Oldclothes()
	{
		System.out.println("Old clothes are used ...>😶‍🌫️");
		return 10;
	}
}
class Fcatory implements Ajio
{
	 

	@Override
	public void Newclcothes() 
	{
		Ajio.super.Oldclothes();
		System.out.println("it clothes both are New..>");
	}
//
//	@Override
//	 public int Oldclothes() {
//		return 10;
//	}

	@Override
	public void old_version() {
	
	}
	
}
