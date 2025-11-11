package arrys_Demo;

public class Class_case_First {

	public static void main(String[] args) {
		 
		Travels S1=new Travels("Seat is ",02);
		S1.s2();
		
	}
}

class Travels
{
	int Seat;
	public Travels(String S,int N)
	{
		System.out.println("All Seat's is Booked !...");
	}
	
	public void seat() 
	{
		System.out.println(Seat);
	}
	public void s2()
	{
		System.out.println("s2 is Travel Class.");
	}
}


