package Consructer;

public class cons_1 {

	public static void main(String[] args)
	{
		 
		
		System.out.println("Details of School Fees.");
				System.out.println();
				
 	        School sc = new School(25000.0);
 	         		sc.Boook();
 	         System.out.println(sc.price);
 	         
	 }
}
	class School
	{
		
		double price;
		
	    public School(double pri)
    {
	    	price=pri;
	    //	System.out.println(price);
	        System.out.println("Very old Book..>");
    }
	
	public void Boook()
	{
		System.out.println("Price Of Schol fees : "+price);
		
	}

}
