package Excepation_1;

public class Encapsulation_05 {

	public static void main(String[] args) {
		 

		copy I = new copy();

		 System.out.println("Name Of Pen : "+I.getName() + 
			" " + "Number Of Pen's : "+I.getNumber_Pen() + " " +
				 "Price OF Pen's : " + I.getPrice());
	}

}

class copy
{
	private String Name = "Trimax";
	private int Number_Pen = 10;
	private double Price = 10.00;
	
	public String getName()
	{
		return Name;
	}
	public int getNumber_Pen()
	{
		return Number_Pen;
	}
	public double getPrice()
	{
		return Price;
	}
}