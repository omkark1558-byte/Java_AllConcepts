package Consructer;

public class cons_03 {

	public static void main(String[] args) {
		 
		car Car=new car(450000.64);
//		Car.Price=450.0;
		
		Car.Displaycar();

	}

}
class car
{
	double Price;
	public car(double T)
	{
		Price=T;
//		System.out.println(T);
	}
	public void Displaycar()
	{
		System.out.println("The Car price :"+Price);
	}
}
