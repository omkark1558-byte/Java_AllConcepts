package Abstraction;

public class Interface_02 {

	public static void main(String[] args) {
	
		
		Dog i = new Dog();
		i.Eating();
		i.Staying();
		i.Walk();
	}

}

interface Animals
{
	void Eating();
	void Walk();
	void Staying();
}


class Dog implements Animals
{
	public void Eating()
	{
		System.out.println("Dog Is eating Fod..");
	}
	public void Walk()
	{
		System.out.println("Dog Walk on 4 leg's..!");
	}
	public void Staying()
	{
		System.out.println("Dog Staying In Home");
	}
	 
}