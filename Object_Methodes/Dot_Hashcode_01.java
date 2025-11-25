package Object_Methodes;


/*
 * the Contcat between Dot_Code and Dot_Hashcvode
 * . = And .# Code bother Are Object class Methodes
 */


public class Dot_Hashcode_01 {

	public static void main(String[] args) {
		 
		
		Car I = new Car();
		
		Car o = new Car();
		
		System.out.println(I.hashCode());
		System.out.println(o.hashCode());

	}
}

class Car
{
	double Price;
	int Number;
	String Name;
}