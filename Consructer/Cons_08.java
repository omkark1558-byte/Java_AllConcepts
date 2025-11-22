package Consructer;


class Car
{
	String Name;
	double Price;
	
	Car(String N,double A)
	{
		Name = N;
		Price = A;
	}
	void Show()
	{
		System.out.println(Name);
		System.out.println(Price);
	}
}
public class Cons_08 {

	public static void main(String[] args) {
	 
		Car H = new Car("Legender",450000.00);
		H.Show();
		
	}
}
