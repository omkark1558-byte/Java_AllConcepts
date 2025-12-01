package Interface;

public class inter_01 {

	public static void main (String args[])
	{
		UPI y=new Payments();	
		y.Phone_pay(0);
		y.Goggle_pay(0);
		y.Zapya_pay(0);
		y.Paytem_pay(0);
		 
	}
}



interface UPI
{
	void Phone_pay(int a);
	
	void Goggle_pay(int b);
	
	void Zapya_pay(int c);
	
	void Paytem_pay(int d);
}
class Payments implements UPI
{

	 
	public void Phone_pay(int a) {
		 System.out.println("Phone-Pe :");
		
	}

	 
	public void Goggle_pay(int b) {
			 System.out.println("G-Pay :");
		
	}

	 
	public void Zapya_pay(int c) {
		 System.out.println("Zapya-Pe :");
		 
	}

	 
	public void Paytem_pay(int d) {
		 System.out.println("Payment-Pe");
		
	}	
}